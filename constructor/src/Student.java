public class Student {
    private String nume;
    private int varsta;


    public String getNume(){
        return nume;
    }
    public int getVarsta(){
        return varsta;
    }

    public void setNume(String ioana){
        this.nume = nume;
    }
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }

    public Student(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    // Copy Constructor
    public Student(Student s){
        this.nume = s.nume;
        this.varsta = s.varsta;
    }

    @Override
    public String toString() {
        return "Student: " +
                "nume ='" + nume + '\'' +
                ", varsta=" + varsta ;
    }
}
