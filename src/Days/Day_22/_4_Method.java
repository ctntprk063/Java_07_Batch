package Days.Day_22;

public class _4_Method {
    public static void main(String[] args) {

        enBuyukSayi(75, 85, 50);
        dongu();
        piramit();
        ucgen();



    }

    public static void enBuyukSayi(int num1, int num2, int num3) {

        int enbuyuk = num1;
        if (num2 > enbuyuk) {
            enbuyuk = num2;
        }
        if (num3 > enbuyuk) {
            enbuyuk = num3;
        }

        System.out.println("enbuyuk = " + enbuyuk);

    }

    public static void dongu() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". döngü");
        }
    }

    public static void ucgen() {

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void piramit() {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <= 10 - i; j++) {

                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}


