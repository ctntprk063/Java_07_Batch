package Exercises.Replit;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _47_PhoneNumberReformat {
    public static void main(String[] args) {

        String input = "1234567890";

        String output = "" + input.substring(0, 3) + "-" + input.substring(3, 6) + "-" + input.substring(6, 9) + "-" + input.substring(9, 10);
        System.out.println("result=" + output);

        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d{3})", "$1-$2-$3");

        System.out.println(number);


    }

}
   /* We are given a string S representing a phone number, which we would like to reformat.
        String S consists of N characters: digits, spaces and/or dashes. It contains at least two digits. Spaces and dashes in string S can be ignored.
        We want to reformat the given phone number in such a way that the digits are grouped in blocks of length three, separated by single dashes. If necessary, the final block or the last two blocks can be of length two.
        Example: 1
        Input:
        00-44 48 5555 8361
        Output
        004-448-555-583-61
        Example: 2
        Input:
        O 22 1985--324
        Output
        022-198-53-24
        Example: 3
        Input:
        555372654
        Output
        555-372-654
        Write a function:
        that, given a string S representing a phone number, returns this phone number reformatted as described above.
        Assume that:
        • N is an integer within the range [2..100];
• string S consists only of digits (0-9), spaces and/or dashes (-);
        • string S contains at least two digits. In your solution, focus on correctness.*/