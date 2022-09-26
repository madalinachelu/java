public class Main {
    public static void main(String []args){
        ///1. Să se creeze o clasă Patrat care are atributele arie și perimetru. Clasa va avea un constructor
        //care va primi lungimea laturii și va completa cele două atribute pe baza valorii ei.

        Patrat p1 = new Patrat();
        System.out.println("lungime = " + p1.getLungime());
        p1.setLungime(100);
        System.out.println("aria = " + p1.arieFaraParam());

        Patrat p2 = new Patrat(10, "red");
        System.out.println("lungime  = " + p2.getLungime());

        System.out.println("aria = " + p2.calculeazaAria(20) );
        System.out.println("perimetru = " + p2.calculeazaPerimetrul(20));

        p2.afCuloare();

    }
}
