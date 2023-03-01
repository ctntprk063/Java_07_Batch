package Days.Day_31.tasks1;

import java.util.Scanner;

public class _1_Length {

    // Write a program that ask user to enter his/her firstname and lastname. Display the number of
    //  characters by assigning a variable.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("isim ve soyadinizi yaziniz:  ");
        String str = sc.nextLine();

        System.out.println("str.length() = " + str.length());


    }

}
