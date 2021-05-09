public class Tuple1 {
    
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
