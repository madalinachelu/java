public class Patrat {
    private int lungime;
    String culoare;

    public int getLungime(){
        return lungime;
    }
    public void setLungime(int lungime){
        this.lungime = lungime;
    }

    public Patrat() {
        this.lungime = lungime;
    }
    public Patrat(int lungime, String culoare){
        this.lungime = lungime;
        this.culoare = culoare;
    }
    public Patrat(int lungime){
        this.lungime = lungime;
    }

    public int calculeazaAria(int lungime){
        return lungime * lungime;
    }

    public int calculeazaPerimetrul(int lungime){
        return 4 * lungime;
    }

    public void afCuloare(){
        System.out.println("Culoare figura geometrica = " + culoare);
    }

    public int arieFaraParam(){
        return lungime *lungime;
    }

}
