package Days.Day_33.tasks;

import java.util.Scanner;

public class _3_Reverse {
//    Write a return method that can reverse a String
//    Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String reverse = sc.nextLine();

        for (int i = reverse.length() - 1; i >= 0; i--) {
            System.out.print(reverse.toUpperCase().charAt(i));
        }


    }
}
