package lt.bit.java.rusiavimas.mokykla;

public class Mokinys extends Zmogus {
    int klase;

    public Mokinys(int klase, String vardas, String pavarde) {
        super(vardas, pavarde);
        this.klase = klase;
    }

    public Mokinys() {
        super();
        System.out.println("Mokinys()");
    }

    @Override
    public String toString() {
        return klase + " klasė " + vardas + " " + pavarde;
    }

}

