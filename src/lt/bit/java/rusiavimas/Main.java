package lt.bit.java.rusiavimas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int []masyvas = {1,5,6,21,63,4};
        System.out.println(Arrays.toString(masyvas));

        int tuscias;
        for (int i = 0; i < masyvas.length; i++){
            for (int j = i+ 1; j < masyvas.length; j++) {
                if (masyvas[i] < masyvas[j]){
                  tuscias = masyvas[i];
                  masyvas[i] = masyvas[j];
                  masyvas[j] = tuscias;
                  System.out.println(Arrays.toString(masyvas));
                }
            }

        }

    }


}
