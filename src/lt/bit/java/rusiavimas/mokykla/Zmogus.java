package lt.bit.java.rusiavimas.mokykla;

public class Zmogus {
    String vardas;
    String pavarde;

    public Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;}

    public Zmogus(){}

    @Override
    public String toString() {
        return  vardas + " " + pavarde;
    }

}


