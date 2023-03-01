package Exercises.Replit;

import java.util.Scanner;

public class FindMidNummer {

//    Write a program that will return mid number out of three numbers.  No need to do any calculations.
//
//            ## Steps
//            1. Create an object of Scanner class.
//            2. Declare int 3 variables: num1, num2, num3.

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter first number:");
//        int num1 = scan.nextInt();
//        System.out.println("Enter second number:");
//        int num2 = scan.nextInt();
//        System.out.println("Enter third number:");
//        int num3 = scan.nextInt();
//
//        System.out.println("input : " + num1);
//        System.out.println("input : " + num2);
//        System.out.println("input : " + num3);
//
//        if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2) {
//            System.out.println("Medium value is: " + num1);
//        }
//        if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1 ) {
//            System.out.println("Medium value is: " + num2);
//        }
//        if (num3 > num1 && num3 < num2|| num3 < num1 && num3 > num2) {
//            System.out.println("Medium value is: " + num3);
//        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("Enter third number:");
        int num3 = scan.nextInt();
//WRITE YOUR CODE HERE

//        System.out.println("input : " + num1);
//        System.out.println("input : " + num2);
//        System.out.println("input : " + num3);

        if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2) {
            System.out.println("Medium value is: " + num1);
        }
        if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1 ) {
            System.out.println("Medium value is: " + num2);
        }
        if (num3 > num1 && num3 < num2|| num3 < num1 && num3 > num2) {
            System.out.println("Medium value is: " + num3);
        }


    }
}
