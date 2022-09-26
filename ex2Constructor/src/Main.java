public class Main {

    public static void main(String []args){
        //Să se creeze o clasă Elev cu atributele nrMatricol, medie și corigent (boolean). Clasa va avea
        //un constructor care primește ca parametru numărul matricol și trei note, pe baza cărora va
        //calcula media și va completa statutul de corigent pe baza ei (true/false)

        Elev e1 = new Elev(12345, 5, 5,5);



       if(e1.validareCorigenta(e1.medieCalc()) == true)
            System.out.println("nu este corigent");
        else
            System.out.println("corigent");
    }




}
