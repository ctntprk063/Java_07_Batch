package Exercises.Replit;

import java.util.Scanner;

public class FindTheLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String text = sc.nextLine();
        String textlength = Integer.toString(text.length());
        System.out.println("Length is : " + textlength);


    }
//    Write a program that will output length of the text (string).
//    Example:
//    Use scanner to read value
//    Display message:
//    Please enter the text:
//    input:
//    java is perfect
//    output:
//    Length is: 4
}
