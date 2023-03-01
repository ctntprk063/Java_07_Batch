package Days.Day_33.tasks;

import java.util.Scanner;

public class _9_TumKarakteriGoster {
    //    Write a program that ask user to enter his/her firstname and lastname. Display each character
//    of full name in the console.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter firstname  : ");
        String firstName = sc.nextLine();
        System.out.print("Enter  lastname : ");
        String lastName = sc.nextLine();

        String fullName = firstName.concat(" " + lastName);
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }


    }
}
