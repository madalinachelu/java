public class Patrat {
    int latura;
    static int nrPatrate = 0;
    Patrat(){
        nrPatrate++;
    }
    Patrat(int latura){
        this.latura = latura ;
        nrPatrate++;
    }

    static void metodaStatica(){
        System.out.println("patrat");
    }

    void metodaNonStatica(){
        latura++;
        nrPatrate++;
        metodaStatica();
    }

}
