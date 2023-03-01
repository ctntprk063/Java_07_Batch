package Exercises.Replit;

import java.util.Scanner;

public class _39_CoverInString {
 /*   Create a method which we can pass 2 String as arguments.
    It will check if first String contains the second give String.
    If so put this part into [] (Square bracket) and display result.
    If first string not contains the second string so put first strng into [](Square bracket) and display result
    Example:
    coverString("java methods", "me")
    output:  java [me]thods
    coverString("midnight in Mississippi", "i")
    output:   m[i]dn[i]ght [i]n M[i]ss[i]ss[i]pp[i]
            3.coverString("Eurotech Study", "SDET")
    output: [Eurotech Study]*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverME) {
        // your code here
if (main.contains(coverME)){
    System.out.println(main);
}



        return main;
    }


}
