package Projects.project_1;

import java.util.Scanner;

public class getTotal {

     /*
     içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz.
     okunan bu 3 string içindeki negaitf de olabilen sayıları toplatın.
     Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        String num1 = "$15";
        String num2 = "$-80";
        String num3 = "$30";
        output ----> -1; olmali
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ilk String  giriniz : ");
        String num1 = sc.nextLine();
        System.out.print(" ikinci String  giriniz : ");
        String num2 = sc.nextLine();
        System.out.print(" ücüncü  String  giriniz : ");
        String num3 = sc.nextLine();

        int sayi1 = Integer.parseInt(num1.replaceAll("[^-0-9]", ""));
        int sayi2 = Integer.parseInt(num2.replaceAll("[^-0-9]", ""));
        int sayi3 = Integer.parseInt(num3.replaceAll("[^-0-9]", ""));

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi3 = " + sayi3);

        int toplam = sayi1 + sayi2 + sayi3;
        if (toplam>0){
            System.out.println("toplam = " + toplam);

        }  if (toplam<=0) {
            System.out.println("sonuc = " + "-1");

        }

    }
}
