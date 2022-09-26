public class Elev {
    ///Clasa va avea
    //    //un constructor care primește ca parametru numărul matricol și trei note, pe baza cărora va
    //    //calcula media și va completa statutul de corigent pe baza ei (true/false)
    int nrMatricol;
    float medie;
    boolean corigent;
    int a, b, c;

    public Elev(int nrMatricol, int a, int b, int c){
        this.nrMatricol = nrMatricol;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float medieCalc(){
        medie = (float) (a + b + c) / 3;
        return  medie;
    }
    public boolean validareCorigenta(float medie){
        if( medie >= 5.0)
            return true;
        else
            return false;
    }
}
