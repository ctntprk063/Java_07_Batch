package Days.Day_31;

import java.util.Scanner;

public class Ornek_1 {
    public static void main(String[] args) {
        //girilen bir stringin bir harfi kac defa tekrar oldugunu yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir string giriniz ");
        String  str=sc.nextLine();

       int sayac=0;
       char harf='e';
       for (int i=0; i<str.length();i++){

           if (str.charAt(i)==harf)

               sayac++;
       }

        System.out.println("sayac = " + sayac);







    }
}
