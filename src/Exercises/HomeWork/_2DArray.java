package Exercises.HomeWork;

import java.util.Scanner;

public class _2DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] answers = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        String[][] list = new String[8][10];
        System.out.println("Fill in the eight student's answers to 10 questions");
        for (int i = 0; i < list.length; i++) {
            int count = 0;

            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = scan.next();
                if (list[i][j].equalsIgnoreCase(answers[j]))
                    count++;

            }
            System.out.println("Student's " + i + " correct answers are " + count);

        }

    }
}
