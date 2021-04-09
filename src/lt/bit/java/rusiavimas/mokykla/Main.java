package lt.bit.java.rusiavimas.mokykla;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Mokinys[] masyvas =
        {
     new Mokinys(1, "Soo", "Ikk",new int[] {5, 6, 8 ,4, 10}),
     new Mokinys(5, "Fkk", "Bu", new int[] {2,8,5,9,6,9}),
     new Mokinys(5, "Aa", "Bu",new int[] {10,10,8,7,9}),
     new Mokinys(3, "Wkk", "Sjw",new int[] {4,6,8,9,10})
        };

        for (Mokinys m : masyvas) {
            System.out.print(m.klase + " klase " + m.vardas + " " + m.pavarde + ", " + m.vidurkis(m.trimestras));
        }
        System.out.println();

        Mokinys tuscias;
        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (compareTo(masyvas[i], masyvas[j]) > 0) {
                    tuscias = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = tuscias;
                }
            }
            System.out.println(i + ": " + Arrays.toString(masyvas));
        }
    }
    static int compareTo(Mokinys a, Mokinys b) {
        // boolean r = a > b;

        // lyginame klases:
        if (a.klase > b.klase) return 1;
        else if (a.klase < b.klase) return -1;

        //lyginu pagal vidurkius:
         if (a.vidurkis(a.trimestras) > b.vidurkis(b.trimestras)) return 1;

        // a.klase == b.klase
        // lyginu pavardes, nes klases yra lygios
        int r = a.pavarde.compareTo(b.pavarde);
        if (r != 0) return r;

        // jei r == 0, t.y. jei pavardes lygios
        r = a.vardas.compareTo(b.vardas);

        return r;
    }


}
