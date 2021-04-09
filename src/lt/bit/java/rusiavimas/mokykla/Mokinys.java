package lt.bit.java.rusiavimas.mokykla;

import java.util.Arrays;

public class Mokinys extends Zmogus {
    int klase;
    int[] trimestras;

    public Mokinys(int klase, String vardas, String pavarde, int[] trimestras) {
        super(vardas, pavarde);
        this.klase = klase;
        this.trimestras = trimestras;
    }

    public Mokinys() {
        super();
        System.out.println("Mokinys()");
    }

    @Override
    public String toString() {
        return klase + " klasė " + vardas + " " + pavarde + " " + (vidurkis(trimestras));
    }

    // vidurkio skaičiavimo metodas (funkcija)
    double vidurkis(int[] m) {
        if (m == null) return 0;
        int sum = 0;
        for (int p : m){
            sum += p;
        }
        return (double) sum / m.length;
        }
    }




