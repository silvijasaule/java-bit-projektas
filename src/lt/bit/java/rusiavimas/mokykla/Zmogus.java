package lt.bit.java.rusiavimas.mokykla;

public class Zmogus {
    private String vardas;
    private String pavarde;

    public Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;}

    public Zmogus(){}

    @Override
    public String toString() {
        return  vardas + " " + pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }
}


