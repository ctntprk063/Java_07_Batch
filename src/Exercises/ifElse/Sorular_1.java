package Exercises.ifElse;

import java.util.Scanner;

public class Sorular_1 {
    /*
           Kullanıcıdan yaş bilgisini isteyiniz

           Eğer yaş 10 dan küçük veya eşit ise
           "facebook hesabi acmak icin cok gencsin"  şeklinde yazdırın

           Eğer yaş 16 dan küçük veya eşit ise
           "ehliyet almak icin cok gencsin"  şeklinde yazdırın

           Eğer yaş 18 den küçük veya eşit ise
           "dovme yaptirmak icin cok gencsin" şeklinde yazdırın

           Eğer yaş 21 den küçük veya eşit ise
           "alkol icmek icin cok gencsin" şeklinde yazdırın

           Eğer yaş 21 den büyük ise
           "istedigini yapabilirsin"  şeklinde yazdırın
 */
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("yasinizi giriniz = ");
        int age= sc.nextInt();
        if (age<=10){
            System.out.println("facebook hesabi acmak icin cok gencsin");
        }else

        if (age<=16){
            System.out.println("ehliyet almak icin cok gencsin");
        }
        else
            if (age<=18){
                System.out.println("dovme yaptirmak icin cok gencsin");
            } else if (age<=21) {
                System.out.println("alkol icmek icin cok gencsin");

            } else if (age>21) {
                System.out.println("istedigini yapabilirsin");

            }


    }
}
