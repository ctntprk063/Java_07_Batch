package Days.Day_31.tasks1;

import java.util.Scanner;

public class _2_karakter {
//    Write a program that ask user to enter his/her firstname and lastname. Display each character
//    of full name in the console.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("isim ve soyadinizi yaziniz:  ");
        String str = sc.nextLine();

        for (int i=0; i<str.length();i++){

            System.out.println(str.charAt(i));
        }



    }
}
