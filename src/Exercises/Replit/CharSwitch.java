package Exercises.Replit;

import java.util.Scanner;

public class CharSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);

        switch (response){

            case 'y':
                System.out.println("Your session will be updated and restarted");break;
            case 'n':
                System.out.println("Your session will be logged out without updating");break;
            case 'c':
                System.out.println("Your session will be updated and closed");break;

            default:
                System.out.println("Sorry, Invalid entry, please try again!");

        }








    }
}
