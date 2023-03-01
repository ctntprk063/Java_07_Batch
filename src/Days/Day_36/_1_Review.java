package Days.Day_36;

import java.util.Scanner;

public class _1_Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" bir kelime giriniz : ");
        String reverse = sc.nextLine();

        for (int i = reverse.length() - 1; i >= 0; i--) {
            System.out.print(reverse.toLowerCase().charAt(i));
        }


    }
}
