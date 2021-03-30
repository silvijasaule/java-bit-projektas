package lt.bit.java;

public class Grudai {
    public static void main(String[] args) {
        long k = 1;
        for (int i = 1; i <= 64; i++) {
            System.out.println(i + " langelyje yra " + k + " grūdų");
            k = k * 2;

        }
    }
}
