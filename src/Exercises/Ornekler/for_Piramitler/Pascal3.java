package Exercises.Ornekler.for_Piramitler;

public class Pascal3 {
    public static void main(String[] args) {

        int a =0;
        for (int i = 0; i < 5; i++) {
            for (int k = 1; k <= 5 - i; k++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++) {

                if (j == 0 || i == 0)
                    a = 1;
                else
                    a = a * (i - j + 1) / j;
                System.out.print(" " + a);
            }
            System.out.println();
        }
    }
}
