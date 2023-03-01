package Days.Day_67;

import java.util.Scanner;

public class Asalsayi {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Lütfen bir sayı girin: ");
//        int sayi = sc.nextInt();
//        boolean asalMi = true;
//        if (sayi < 2) {
//            asalMi = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(sayi); i++) {
//                if (sayi % i == 0) {
//                    asalMi = false;
//                    break;
//                }
//            }
//        }
//        if (asalMi) {
//            System.out.println(sayi + " bir asal sayıdır.");
//        } else {
//            System.out.println(sayi + " bir asal sayı değildir.");
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = sc.nextInt();
        int sayac = 0;

        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
    }
}

