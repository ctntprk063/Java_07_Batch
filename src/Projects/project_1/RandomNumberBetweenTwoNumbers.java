package Projects.project_1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {

    /*
     Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter min number : ");
        int min=sc.nextInt();

        System.out.print("Enter max number : ");
        int max=sc.nextInt();

        int numberInRange=(int)(Math.random()*((max-min)+1))+min;
        System.out.println("numberInRange = " + numberInRange);


       /* Scanner sc=new Scanner(System.in);
        System.out.print("Enter min number : ");
        int kucuk=sc.nextInt();

        System.out.print("Enter max number : ");
        int buyuk=sc.nextInt();

        int numberInRange=(int)(Math.random()*((buyuk-kucuk)+1))+kucuk;
        System.out.println("numberInRange = " + numberInRange);
*/


    }
}
