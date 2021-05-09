import java.util.ArrayList;
//import java.util.Dictionary;
//import java.util.Hashtable;

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
    
    //private ArrayList<Boolean> principalB = new ArrayList<>();
    //private ArrayList<Boolean> principalC = new ArrayList<>();
    //private Dictionary<Boolean, String> principal = new Hashtable<>();
    public static ArrayList<ArrayList<Tuple1>> formulas;
    public static Boolean flag;

    public static void main(String[] args) {
        //UNSAT
        String str = "(~p | R ) & (~x) & (p) & (~p | x | ~R | x)";
        // SAT
        str = "(~q | ~S | ~Q | ~p | ~p | ~q | ~y | ~X | ~p | ~L | ~V | ~Y | ~U | ~q | ~u | ~R | ~R | ~P | ~V | ~O | ~m | ~w | ~J | ~u | ~S | ~d | ~s | ~w | ~f | ~p | ~X | ~i | ~C) & (s) & (~B | ~O | ~X | ~r | ~T | ~f | ~A | ~t | ~u | ~e | ~C | ~F | ~d | ~r | S | ~G | ~H | ~U | ~H | ~l | ~H | ~R) & (~O | ~p | ~n | ~W | ~t | ~g | ~S | ~E | ~V | ~X | ~l | ~U | ~r | ~r | ~r | T | ~N | ~V | ~C | ~O | ~r) & (~q | ~Z | J | ~J | ~l) & (~s | ~i | h | ~t | ~w | ~U | ~w | ~E | ~P | ~t | ~X | ~N) & (~w | ~c | ~x | ~D | ~y | ~o | ~b | ~t | ~N | ~a | ~W | ~F | ~h | ~R | ~g | ~K | ~k | ~I | ~w | ~c | ~k | ~J | ~d | ~Z | ~W | ~L | ~g | ~N | ~Q | ~I | ~d | ~K | ~B | ~g | ~r | t | ~c | ~B | ~t | ~A | ~c) & (~b | l | ~K | ~v | ~s | ~v | ~X | ~P | ~S | ~W | ~h | ~A | ~O | ~W | ~a | ~G | ~Y | ~S | ~g | ~t | ~o | ~q | ~f | ~U | ~d | ~K | ~n | ~e | ~o | ~A | ~z | ~n | ~C | ~H | ~T | ~Q | ~T) & (~Q | ~F | ~g | ~e | ~N | ~h | ~l | ~U | ~V | ~E | ~b | ~r | ~B | ~a | ~J | ~Y | ~Y) & (~X | ~U | ~f | ~w | ~d | ~a | ~b | ~c | ~o | ~T | ~t | ~F | ~x | ~h | ~O | ~W | ~K | ~O | ~V | ~T | ~J | ~r | ~C | ~E | ~j | ~Y | ~y | ~x | ~Y | ~H | ~u | ~q | ~v | ~p | ~n | ~f | ~I | ~O) & (~l | ~L | ~q | ~T | ~z | ~k | ~Z | ~O | ~P | ~G | ~Y | ~g | ~i | ~Y | ~w | ~x | ~V | ~Z | ~i | ~s | ~O | ~Q | ~q | ~K | ~g | ~g | ~T | ~h | ~H | ~X | ~w | ~D | ~N | ~M | ~y | ~n | ~t) & (~f) & (~j | ~G | ~t | ~C | ~W | ~m | ~W | ~l | ~N | T | ~y | ~v | ~y | ~U | ~H | ~o | ~I | ~X | ~k | ~b | ~O | ~C | ~j) & (~A | ~A | ~s | ~O | ~Y | ~Q | ~S | ~B | ~Y | ~k | ~D | ~N | ~o | ~T | ~i | ~k | ~m | ~X | ~P | ~I | ~G | ~C | ~s | ~J | ~X | ~U | ~F | ~h | ~t | ~X | ~s | ~F | ~S | ~q | ~x | ~E | ~I | ~V | ~Q | ~L | ~p | ~J | ~Q | ~e | ~m | z | ~B | ~w | ~N | ~C) & (~H | ~h | ~g | ~h | ~E | ~u | ~B | ~g | ~v | ~u | ~Y | ~D | ~D | ~a | ~d | ~T | ~f | ~v | ~y | ~K | ~R | ~V | ~U | ~j | ~t | ~D | ~h) & (~m | ~Z | ~G | ~B | ~x | ~c | ~k | ~P | ~j | ~F | ~x | ~j | ~a | ~I) & (~b | ~w | ~y | ~x | ~d | ~S | ~W | ~S | ~F | ~U | ~K | ~H | ~K | ~Q | ~S | ~U | ~i | ~z | ~P | ~J | ~l | ~B | ~K | ~i | ~o | ~i | ~T | ~m | ~h | ~G | ~v | ~B | ~t | ~a | ~X | ~B | ~o | ~Q | ~Y | ~s | ~g | ~L | ~C | ~R | ~N | ~H | ~v | ~H | ~y | ~N | ~H | ~x) & (~d | ~a | ~G | ~x | ~a | ~O | ~e | ~l | ~g | a) & (~e | ~f | ~i | ~L | ~E | ~p | ~d | ~V | ~U | ~o | ~Z | ~W | ~P | ~p | ~h | ~f | ~j | ~i | ~S | ~K | ~E | ~B | ~b | ~k | ~H | ~c | ~l | ~y | ~r | ~F | ~l | ~K | ~T | ~S | ~r | ~L | ~Q | ~n | ~M | ~q | ~R | ~z | ~N | ~X | ~M | ~C | ~G | ~w) & (~d | ~h) & (~R | ~b | ~H | ~N | ~B | ~e | ~f | ~d | ~o | ~f | ~M | ~A | ~Y | ~q | ~O | ~K | ~s | ~X | ~X | ~z | ~y | ~i | ~y | ~d | ~Q | ~Y | ~t | ~M | ~z | ~P | ~x | ~F) & (~O | ~N | ~x | ~w | ~u | ~r | ~M | ~o | ~c | ~x | ~j | ~D | ~e | ~O | ~I | ~j | ~I | ~A | ~X | ~c | ~W | ~E | ~C | ~e | ~l | ~o | ~O | ~b | ~N | ~p | ~p | ~I | ~D | ~h | ~j | ~C | ~N | ~N | ~d | ~v | ~O | ~R | ~X | ~C | ~T | ~h | ~c) & (~D | ~S | ~V | ~g | ~z | ~u | ~M | ~Y | ~A | ~w | ~i | ~N | ~w | ~E | ~H | ~X | ~N | ~t | ~B | ~E | ~L | ~G | ~L | ~z | ~g | ~L | ~Z | ~M | ~h | ~Q | ~y | ~q | ~h | ~f | ~l | ~i | ~p | ~M | ~o | ~e | ~b | ~S | ~D | ~a | ~C | ~K | ~U | ~z | ~X | ~Z | ~n) & (~D | ~W | ~j | ~Y | ~K | ~W | ~i | ~b | ~r | ~o | ~L | ~K | ~j | ~F | ~k | ~Z | ~x | ~p | ~d | ~V | ~k | ~D | ~h | ~a | ~t | ~p | ~R | ~N | ~a | ~C | ~f | ~C) & (~u | ~r | ~j | ~s | ~S | ~S | ~b | ~b | ~f | ~i | ~e | ~Y | ~q | ~Q | ~T | ~N | ~P | ~n | ~h | ~t | ~C | ~a | ~F | ~b | ~O | ~M) & (~H | ~q | ~y | ~M | ~q | ~G | n | ~o | ~V | ~O | ~h | ~n | ~I | ~L | ~y | ~K | ~c | ~T | ~Y) & (~s | ~F) & (~P | ~d | ~i | ~M | ~k | ~A | ~T | ~d | ~K | ~a | ~t | ~X | ~d | ~x | ~N | Y | ~U | ~T | ~t | ~h | ~v | ~b | ~f | ~h | ~F | ~E | ~f | ~j | ~a | ~V | ~d | ~b | ~q | ~e | ~x | ~Y | ~l | ~E | ~i | ~t | ~O | ~U | ~r | ~Y | ~V | ~n | ~X) & (~p | ~h | ~P | ~a | ~r | ~l | ~J | ~g | ~B | ~l | ~e | ~Z | O | ~W | ~m | ~j | ~D | ~X | ~C | ~R | ~w | ~a | ~n | ~I) & (~J | ~r | ~M | ~D | ~N | ~X | ~F | ~u | ~Q | ~l | ~r | ~O | ~e | ~P | ~D | ~t | ~j | ~W | ~Y | ~z | ~A | ~s | ~e | ~l | ~r | ~w | ~E | ~G | ~i | ~L | ~h | ~y | ~y | ~R | ~D | ~b | ~c | ~v | ~P | ~Y | ~C | ~h | ~V) & (~n | ~b | ~u | ~M | ~P | ~n | ~I | ~g | ~j | ~w | ~Y | ~t | ~Y | ~Q | ~y | ~y) & (~e | ~S | ~N | ~Q | ~d | ~h | ~c | ~D | ~x | ~n | ~X | ~Q | ~o | ~p | ~N | ~a | ~g | ~Q | ~E | ~l | ~n | ~f | ~u | ~H | ~M | ~z | ~S | ~w | ~i | ~M | ~Y | ~X | ~Z | ~J | ~y | ~e | ~C | ~y | ~d | ~R) & (~u | ~i | ~y | ~x | ~m | ~S | e) & (~F | ~C | ~f | ~X | ~U | ~c | ~E | ~L | ~D | ~q | ~I | ~P | ~T | ~h | ~M | ~M | ~z | ~A | ~X | ~u | ~T | ~c | ~R | ~X | ~U | ~L | ~G | ~B | ~c | ~V | ~o | ~Q | ~u | ~l | ~t | ~w | ~C | ~z | ~S | ~j | ~D | ~y | ~f | ~z | ~z | ~B | ~k | ~s)";
        // SAT
        str = "(~p | a ) & (p) & (~p | ~R | x) & (~W | P | ~h) & (F) & (~f | ~q | e) & (~t | ~k | ~l)";
        // 
        str = "(~p | Q | ~r) & (~t) & (P) & (~T | x | Z) & (F)";

        //ArrayList<String> test1 = new ArrayList<>();
        //Dictionary<Boolean, String> test = new Hashtable<>();
        ArrayList<Tuple1> teste2 = new ArrayList<>();
        Tuple1 crl = new Tuple1();
        crl.setF(true);
        crl.setC('t');
        //System.out.println(crl.toString());
        teste2.add(crl);
        //System.out.println(teste2.toString());


        // Começa aqui
        formulas = new ArrayList<>();
        ArrayList<Tuple1> tmp = new ArrayList<>();
        Tuple1 t = new Tuple1();

        int i = 0;
        int target = str.length();
        flag = false;
        
        char[] chars = str.toCharArray();
        char key;

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
        //System.out.println(formulas.toString());

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
            //for(int j = 0; j < formulas.get(i).size(); j++){
                if(formulas.get(i).size() == 1 && formulas.get(i).get(0).getF()){
                    verified.add(formulas.get(i).get(0).getC());
                }
                else{
                    aux.add(formulas.get(i));
                }
            //}
            
        }

        int line = aux.size();

        while(true){
            System.out.println(aux.toString());

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