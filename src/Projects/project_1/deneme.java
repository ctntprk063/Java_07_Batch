package Projects.project_1;

import java.util.Scanner;

public class deneme {


//
//        static void Faktoriyel(int sayi) {
//            int sonuc = 1;
//            for(int i = 1; i <= sayi; i++)
//            {
//                sonuc = sonuc * i;
//            }
//            System.out.println(sayi + "!= " + sonuc);
//        }
//        public static void main(String[] args) {
//
//            Scanner scan = new Scanner(System.in);
//
//            System.out.print("Bir sayi giriniz: ");
//            int sayi = scan.nextInt();
//            Faktoriyel(sayi);
//
//        }





    public static int Faktoriyel(int sayi)
    {
        if (sayi >= 1)
            return sayi * Faktoriyel(sayi - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");

        int num = reader.nextInt();

        System.out.printf("%d Sayısının Faktöriyeli = %d \n", num, Faktoriyel(num));
    }
}

