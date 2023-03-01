package Days.Day_33;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("yasinizi giriniz...");
        int myAge = scanner.nextInt();



        if (myAge <= 10)  {
            System.out.println("facebook hesabi acmak icin cok gencsin");
        }
        if (myAge <= 16) {
            System.out.println(
                    "ehliyet almak icin cok gencsin");
        }
        if(myAge <= 18){
            System.out.println("dovme yaptirmak icin cok gencsin"); }
        if(myAge <= 21){
            System.out.println("alkol icmek icin cok gencsin");}
        if(myAge > 21){
            System.out.println("istedigini yapabilirsin");}
    }
}
