package Exercises.Ornekler.for_Piramitler;

public class PascalUcgeni2 {
    public static void main(String[] args) {

        int katsayi = 1;

        for(int i = 0; i < 5; i++) {
            for(int k = 1; k < 5 - i; ++k) {
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    katsayi = 1;
                else
                    katsayi = katsayi * (i - j + 1) / j;

                System.out.printf("%4d", katsayi);
            }

            System.out.println();
        }





    }
}
