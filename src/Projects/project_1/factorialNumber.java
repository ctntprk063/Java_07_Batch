package Projects.project_1;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        /*
        Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720

         */


         //      kodu burdan başlatın


        Scanner sc =new Scanner(System.in);
        System.out.print(" bir sayi giriniz : ");
        int sayi=sc.nextInt();
        int faktoryel=1;
        for (int i=1;i<=sayi;i++){
            faktoryel*=i;
        }
        System.out.println(sayi+"  sayisinin faktoryeli = "+ faktoryel);

//        1 * 1 = 1 (faktoriyel = 1, i = 1)
//        1 * 2 = 2 (faktöriyel = 1, i = 2)
//        2 * 3 = 6 (faktöriyel = 2, i = 3)
//        6 * 4 = 24 (faktöriyel = 6, i= 4)
//        24 * 5 = 120 (faktöriyel = 24, i = 5)

    }
}

