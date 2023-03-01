package Days.Day_22.homework;

public class _5_OddEven {
    public static void main(String[] args) {
        sumOfOddNumbers(30);
        System.out.println();
        sumOfEvenNumbers(41);
        calculator();

    }

    public static void sumOfOddNumbers(int num) {
        int sayi;
        for (sayi = 1; sayi < num; sayi++) {
            if (sayi % 2 == 1) {
                System.out.println(sayi + "  tek sayi'dir");
            }

        }
    }

    public static void sumOfEvenNumbers(int num) {
        int sayi;
        for (sayi = 1; sayi < num; sayi++) {
            if (sayi % 2 == 0) {
                System.out.println(sayi + "  cift sayi'dir ");
            }
        }

    }
    public static void calculator(){

        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){

                System.out.println(i +" x "+j+ " = "+ (i*j));
            }
            System.out.println();
        }





    }
}
