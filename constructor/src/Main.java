public class Main {
    public static void main(String []args){
        /*Student st1 = new Student();

        System.out.println("Nume = " + st1.getNume());
        System.out.println("Varsta = " + st1.getVarsta());*/

        Student st2 = new Student("Ana", 21);

        System.out.println("Nume st 2= " + st2.getNume());
        System.out.println("Varsta st 2= " + st2.getVarsta());


        Student st3 = st2; // practic este o copie a studentului st2, nu este un nou obiect

        //st3.setVarsta(100);
        System.out.println("Nume st3' = " + st3.getNume());
        System.out.println("Varsta st3' = " + st3.getVarsta());


        Student st4 = new Student(st2);  // Copy Constructor
        st4.setVarsta(100);
        System.out.println("Nume st4 = " + st4.getNume());
        System.out.println("Varsta st4 = " + st4.getVarsta());

        System.out.println(st4);  //Student@34c45dca
        //trebuie @Override pentru toString







    }
}
