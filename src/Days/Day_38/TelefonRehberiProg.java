package Days.Day_38;

import java.util.Scanner;

public class TelefonRehberiProg {
    public static void main(String[] args) {


     System.out.println("Telefon rehberi programı");
    Kisi[] rehberim = new Kisi[3];

    Kisi kisi = new Kisi();
    kisi.ad = "Ahmet";
    kisi.adresi = "Ankara/Turkiye";
    kisi.telNo = 116733123;

    rehberim[0] = kisi;

    kisi = new Kisi();
    kisi.ad = "Ayla";
    kisi.adresi = "Hannover/Germany";
    kisi.telNo = 497647686;

    rehberim[1] = kisi;

    kisi = new Kisi();
    kisi.ad = "Ayla";
    kisi.adresi = "London/England";
    kisi.telNo = 497647686;
    rehberim[2] = kisi;

        System.out.println("Rehberin kaydedebileceği kişi sayısı = " + rehberim.length);

    //    kisi.listele(rehberim);

    Scanner veriGir = new Scanner(System.in);

        System.out.print("Aramak istediğiniz isimi giriniz  : ");
    String isim = veriGir.nextLine();
        kisi.isimdenBul(rehberim,isim);
}
}
