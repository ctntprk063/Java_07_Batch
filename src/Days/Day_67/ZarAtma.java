package Days.Day_67;

import java.util.Random;
import java.util.Scanner;

public class ZarAtma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen 1 ile 12 arasında bir sayı girin: ");
        int hedef = sc.nextInt();
        int toplam = 0;
        int atisSayisi = 0;
        while (toplam != hedef) {
            int zar1 = (int)(Math.random() * 6) + 1;
            int zar2 = (int)(Math.random() * 6) + 1;
            toplam = zar1 + zar2;
            atisSayisi++;
            System.out.println( atisSayisi + " Atış " +  ": " + zar1 + " ve " + zar2 + " atıldı, toplam: " + toplam);
        }
        System.out.println("Tebrikler! " + atisSayisi + " atışta hedefe ulaştınız.");



        // Kullanicidan 1 ile 12 arasinda bir sayi aliniz,
        // Daha sonra iki zar atarak kullanicinin soyledigi rakama
        // kac zar atisi ile ulastigimizi tespit eden bir method yaziniz

//        System.out.println("Please give me a number between 2 nd 12!");
//        Scanner sc = new Scanner(System.in);
//        int sum = sc.nextInt();
//        System.out.println("You have found the number after " + diceSum(sum) + " attempt");
//
//    }
//
//    public static int diceSum(int sum){
//        Random r1 = new Random();
//        Random r2 = new Random();
//        int zar1;
//        int zar2;
//        int counter = 0;
//
//        if(sum >1 && sum <=12){
//            do {
//                zar1 = r1.nextInt(1, 7);
//                zar2 = r2.nextInt(1, 7);
//                System.out.println(zar1 + " and " + zar2 + " = " + (zar1 + zar2));
//                counter++;
//            }while(sum != zar1+zar2);
//
//        }else{
//            System.out.println("Number you have choosen is out of range");
//        }
//        return counter;
    }
}
