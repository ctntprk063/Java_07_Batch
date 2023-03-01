package Days.Day_31.tasks1;

import java.util.Scanner;

public class _3_AyniKarakter {
//    Write a program to count the number of occurrences for specific char
//    String word = “Abcdaorwakocoeeca”
//    Number of ‘a’ in this string is: 3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("isim ve soyadinizi yaziniz:  ");
        String str = sc.nextLine();

        int sayac = 0;
        char harf = 'a';
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == harf) {
                sayac++;
            }

        System.out.println("sayac = " + sayac);


    }


}
