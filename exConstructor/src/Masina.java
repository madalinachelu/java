public class Masina {
    private String marca;
    private int anFabricatie;
    private String model;

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getAn(){
        return anFabricatie;
    }
    public void setAn(int anFabricatie){
        this.anFabricatie = anFabricatie;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    ///constructor fara param
    public Masina(){
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.model = model;
    }

    //constructor cu doi param
    public Masina(String marca, String  model){
        this.marca = marca;
        this.model = model;
    }
    //constructor cu trei param si afisare
    public Masina(String marca, int anFabricatie, String model){
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.model = model;
        System.out.print("marca = " + model);
        System.out.print(", anFabricatie = " + anFabricatie);
        System.out.print(", model = " + model);
        System.out.println();
    }

    public void afisare(){
        System.out.println("marca = " + model);
        System.out.println("anFabricatie = " + anFabricatie);
        System.out.println("model = " + model);
        System.out.println();
    }

    public Masina(Masina m){
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.model = model;

    }





}
