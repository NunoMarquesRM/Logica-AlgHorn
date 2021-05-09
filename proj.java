import java.util.ArrayList;
import java.util.Scanner;
/*
 * Turno: PL2
 * 
 * Nome: Nuno Marques
 * Nº: 38958
 * 
 * Nome: Tomás Vicente
 * Nº: 39067
 * 
 * Compile:
 * javac -encoding utf8 proj.java
 * 
 * Execute:
 * java -Xmx64M -Xss32M -classpath . proj
 */
public class proj {
    public static ArrayList<ArrayList<Tuple1>> formulas;
    public static Boolean flag;

    public static void main(String[] args) {
        /*
        * (~p | Q | ~r) & (~t) & (P) & (~T | x | Z) & (F)
        * NA
        * (~p | R ) & (~x) & (p) & (~p | x | ~R | x)
        * UNSAT
        * (~p | a ) & (p) & (~p | ~R | x) & (~W | P | ~h) & (F) & (~f |~q | e) & (~t | ~k | ~l)
        * SAT
        */
        Scanner sc = new Scanner(System.in);

        while(true){
            String str = sc.nextLine();
            
            if(str.isEmpty()){
                break;
            }
            
            formulas = new ArrayList<>();
            flag = false;

            ArrayList<Tuple1> tmp = new ArrayList<>();
            Tuple1 t = new Tuple1();
            int i = 0;
            int target = str.length();
            char[] chars = str.toCharArray();
            char key;

            /* Leitura do conteúdo da string e separação dos elementos importantes.
            *  Passos:
            *  -> Inicia uma nova cláusula no char '('
            *  -> Ignora ' ', '|', '&'
            *  -> Quando é negativo, guarda no arraylist temporário
            *  -> Quando é positivo, guarda no arraylist temporário
            *  -> Quando encontra o char ')' a cláusula termina, por isso:
            *  ----> Entra na função put_Extra
            *  ----> Guarda o return da função no arraylist principal 'formulas'
            *  ----> Limpa o arraylist temporário
            *  ----> Dá reset à variável flag
            */
            while(i != target){
                key = chars[i];

                if(key == '('){
                    flag = true;
                }
                else if(key == ' '){
                    ;
                }
                else if(key == '|'){
                    ;
                }
                else if(key == '&'){
                    ;
                }
                else if(key == '~'){
                    t = new Tuple1(false,chars[i+1]);
                    tmp.add(t);
                    i += 1;
                }
                else if(key == ')'){
                    formulas.add(put_extra(tmp));
                    tmp = new ArrayList<>();
                    flag = false;
                }
                else{
                    t = new Tuple1(true,chars[i]);
                    tmp.add(t);
                }
                i += 1;
            }

            if(!is_formula()){
                System.out.printf("NA\n");
            }
            else{
                if(horn()){
                    System.out.printf("SAT\n");
                }
                else{
                    System.out.printf("UNSAT\n");
                }
            }
        }
        sc.close();
    }
    /* 
    * Função put_extra
    * - Recebe como parâmetro o arraylist temporário da função principal
    *   Verifica se há alguma clásula com apenas um literal negativo:
    *     -> Se existir, adiciona a essa clásula o char 'ç' positivo
    *     -> Desta forma sabe-se que a fórmula de Horn é contraditória
    */
    public static ArrayList<Tuple1> put_extra(ArrayList<Tuple1> subform)
    {
        flag = false;
        for (int i = 0; i < subform.size() ; i++){
            if(subform.get(i).getF()){
                flag = true;
            }
        }
        if(!flag){
            Tuple1 t = new Tuple1(true,'ç');
            subform.add(t);
        }
        return subform;
    }
    /*
    * Função is_formula
    * - Utiliza o arraylist principal formulas
    *   Verifica se a formula é formula de Horn:
    *     -> 
    */
    public static Boolean is_formula(){
        for (int i = 0; i < formulas.size() ; i++){
            if(!more_than_one(formulas.get(i))){
                return false;
            }
        }
        return true;
    }

    public static Boolean more_than_one(ArrayList<Tuple1> xx){
        ArrayList<Character> c = new ArrayList<>();

        for (int i = 0; i < xx.size() ; i++){
            if(xx.get(i).getF()){
                if(!c.contains(xx.get(i).getC())){
                    c.add(xx.get(i).getC());
                }
            }
        }
        if( c.size() < 2){
            return true;
        }
        return false;
    }

    public static Boolean horn(){
        ArrayList<Character> verified = new ArrayList<>();
        ArrayList<ArrayList<Tuple1>> aux = new ArrayList<>();

        for (int i = 0; i < formulas.size() ; i++){
            if(formulas.get(i).size() == 1 && formulas.get(i).get(0).getF()){
                verified.add(formulas.get(i).get(0).getC());
            }
            else{
                aux.add(formulas.get(i));
            }
        }

        int line = aux.size();

        while(true){
            //System.out.println(aux.toString());

            ArrayList<ArrayList<Tuple1>> new_new = new ArrayList<>();

            for (int i = 0; i < aux.size() ; i++){
                Tuple1 t = verified2(aux.get(i), verified);
                if(t.getF()){
                    verified.add(t.getC());
                }
                else{
                    new_new.add(aux.get(i));
                }
            }

            if(verified.contains('ç')){
                return false;
            }

            if(line == new_new.size()){
                return true;
            }
            else{
                line = new_new.size();
            }
            aux = new_new;

            if(aux.isEmpty()){
                return true;
            }
        }
    }

    public static Tuple1 verified2(ArrayList<Tuple1> subform, ArrayList<Character> verified){
        char aux = ' ';
        Tuple1 t;

        for (int i = 0; i < subform.size() ; i++){
            if(subform.get(i).getF()){
                aux = subform.get(i).getC();
            }
            else{
                if(!verified.contains(subform.get(i).getC())){
                    t = new Tuple1(false, '1');
                    return t;
                }
            }
        }
        t = new Tuple1(true, aux);
        return t;
    }
}

class Tuple1 {
    
    private Boolean f;
    private char c;

    public Tuple1(){

    }

    public Tuple1(Boolean f, char c){
        this.f = f;
        this.c = c;
    }

    public Boolean getF() {
        return f;
    }

    public char getC() {
        return c;
    }

    public void setF(Boolean f) {
        this.f = f;
    }

    public void setC(char c) {
        this.c = c;
    }
    

    @Override
    public String toString() {
        return f + "," + c;
    }
}