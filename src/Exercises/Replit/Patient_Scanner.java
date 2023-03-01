package Exercises.Replit;

import java.util.Scanner;

public class Patient_Scanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");

        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName=sc.nextLine();
        System.out.println("Enter your last name");
        String lastName=sc.nextLine();
        System.out.println("Enter your email");
        String email=sc.nextLine();
        System.out.println("Enter your street");
        String street=sc.nextLine();
        System.out.println("Enter your city");
        String city=sc.nextLine();
        System.out.println("Enter your state");
        String state=sc.nextLine();

        System.out.println("Enter your zip code");
        int zipcode=sc.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber=sc.nextLong();
        System.out.println("Enter your personal  phone number");
        long personalPhoneNumber=sc.nextLong();

        System.out.println("Enter your age");
        int age=sc.nextInt();

        System.out.println("Enter your height");
        double height=sc.nextDouble();
        System.out.println("Enter your weight");
        double weight=sc.nextDouble();

        System.out.println("Are you married?");
        boolean married=sc.nextBoolean();

        String fullname=lastName+","+firstName;
        System.out.println(" Full name: "+fullname);

        String adress=street+","+city+", "+" "+zipcode;
        System.out.println("adress : " + adress);

        System.out.println("work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+", email: "+ email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Married?:  "+married);







    }
}
