package Exercises.Replit;

import java.util.Scanner;

public class _43_PalindrameWord {
   /* A word is called a palindrome word if the reverse of it is the same as the original.
    Create a program to check if given string is a palindrome word or not.
    example:
    input radar
    output: Entered string is a palindrome.
            input: level
    output: Entered string is a palindrome.
            input: etc
    output: Entered string isn't a palindrome.*/

    public static void main(String[] args) {

        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = sc.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string isn't a palindrome.");


    }
}
