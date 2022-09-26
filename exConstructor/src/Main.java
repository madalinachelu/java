public class Main {
    public static void main(String []args){
        //Să se creeze o clasă Masina care va avea atributele marca, model și an de fabricație. Să se
        //creeze trei constructori cu parametri diferiți (la alegerea voastră), care să afișeze un mesaj la
        //crearea unui nou obiect conținând valorile din parametrii constructorilor (ex: „Mașina e
        //fabricată în 2005”, „Ford Focus 2016” etc.

        Masina m1 = new Masina();
        Masina m2 = new Masina("Ford", "Ford_X1");




        System.out.println("constructor fara param: ");

        m1.afisare();
        m2.afisare();
        Masina m3 = new Masina("Dacia", 1900, "Logan");

        // nu merge atribuirea daca este vorba de un copy constructor
        Masina m5 = new Masina(m2);

        System.out.println();
        m3.afisare();
        m5.afisare();



    }

}
