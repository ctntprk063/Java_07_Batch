package Exercises.Replit;

import java.util.Scanner;

public class Schools_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        double mat = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        double biyo = sc.nextDouble();
        sc.nextLine();


        System.out.println("Please enter subject name number 3 and score for this subject");
        double eng = sc.nextDouble();
        sc.nextLine();


        System.out.println("Please enter subject name number 4 and score for this subject");
        double kimy = sc.nextDouble();
        sc.nextLine();


        System.out.println("Please enter subject name number 5 and score for this subject");
        double musik = sc.nextDouble();
        sc.nextLine();


        System.out.println("Summary: Math - "+ mat+",  Biology - "+biyo+",  English - "+eng+", Chemistry - "+kimy+",  Music - "+musik);

        double average=(mat+eng+kimy+biyo+musik)/5;
        System.out.println("Your average score is: " + average);

        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");

      //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        int mat = sc.nextInt();
        System.out.println("math "+ mat);

        System.out.println("Please enter subject name number 2 and score for this subject");
        double biyo = sc.nextDouble();
        System.out.println("Biology " +biyo);

        System.out.println("Please enter subject name number 3 and score for this subject");
        double eng = sc.nextDouble();
        System.out.println("English " +eng);

        System.out.println("Please enter subject name number 4 and score for this subject");
        double kimy = sc.nextDouble();
        System.out.println("Chemistry  " +kimy);

        System.out.println("Please enter subject name number 5 and score for this subject");
        double musik = sc.nextDouble();
        System.out.println("Music " +musik);

        System.out.println("Summary: Math - "+ mat+",  Biology - "+biyo+",  English - "+eng+", Chemistry - "+kimy+",  Music - "+musik);

        double average=(mat+eng+kimy+biyo+musik)/5;
        System.out.println("Your average score is: " + average);

        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");*/

//  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to the Grader!");
//        System.out.println("Please enter subject name number 1 and score for this subject");
//        double mat = sc.nextDouble();
//        System.out.println(mat);
//
//        System.out.println("Please enter subject name number 2 and score for this subject");
//        double biyo = sc.nextDouble();
//        System.out.println(biyo);
//
//        System.out.println("Please enter subject name number 3 and score for this subject");
//        double eng = sc.nextDouble();
//        System.out.println(eng);
//
//        System.out.println("Please enter subject name number 4 and score for this subject");
//        double kimy = sc.nextDouble();
//        System.out.println(kimy);
//
//        System.out.println("Please enter subject name number 5 and score for this subject");
//        double musik = sc.nextDouble();
//        System.out.println(musik);
//
//        System.out.println("Summary: Math - "+ mat+",  Biology - "+biyo+",  English - "+eng+", Chemistry - "+kimy+",  Music - "+musik);
//
//        double average=(mat+eng+kimy+biyo+musik)/5;
//        System.out.println("Your average score is: " + average);
//
//        System.out.println("Thank you for using Grader!");
//        System.out.println("Goodbye!");




    }
}
