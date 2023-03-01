package Days.Day_33.tasks;

import java.util.Scanner;

public class _5_SesliHarfBulma {
    //    Write a program to print only vowel (a,e,o,i,u) in given string
//    String word = “Hello World";
//    Output: e,o,o

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("isim ve soyisim yaziniz:  ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {

                System.out.print(str.charAt(i) + ",");
            }


        }


    }
}
