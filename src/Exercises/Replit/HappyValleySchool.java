package Exercises.Replit;

import java.util.*;

public class HappyValleySchool {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter age : ");
        int age = sc.nextInt();
        if (age < 2) {
            System.out.println("Enter age: \nineligible");
        } else if (age == 2) {
            System.out.println("Enter age: \ntoddlera");
        } else if (age >= 3 && age <= 5) {
            System.out.println("Enter age:\nearly childhood");
        } else if (age >= 6 && age <= 7) {
            System.out.println("Enter age:\nyoung reader");
        } else if (age >= 8 && age <= 10) {
            System.out.println("Enter age:\nelemantary");

        } else if (age >= 11 && age <= 12) {
            System.out.println("Enter age:\nmiddle");

        }
        else if (age == 13 ) {
            System.out.println("Enter age:\nimpossible");

        }
        else if (age >= 14 && age <= 16) {
            System.out.println("Enter age:\nhigh school");

        }else if (age >= 17 && age <= 18) {
            System.out.println("Enter age:\nscholar");

        }
        else if (age >18 ) {
            System.out.println("Enter age:\nineligible");

        }













    }
}