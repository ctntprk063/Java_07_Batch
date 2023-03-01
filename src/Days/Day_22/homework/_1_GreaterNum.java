package Days.Day_22.homework;

public class _1_GreaterNum {
    public static void main(String[] args) {

        greaterNumber(25, 45, 33);

    }
    public static void greaterNumber(int num1, int num2, int num3) {

        int enbuyuk = num1;

        if (num2 > enbuyuk) {
            enbuyuk = num2;
        }
        if (num3 > enbuyuk) {
            enbuyuk = num3;
        }
        System.out.println("enbuyuk sayi =  " + enbuyuk);
    }


}
