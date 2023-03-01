package Projects.kucukProjeler.seyehat;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SeyehatIslem {
    Scanner sc = new Scanner(System.in);


    public void gidilecekSehir() {
        System.out.println("Java Bahnhofa Hos geldiniz....");
        System.out.print(" \n1-köln\n2-Frankfurt\n3-Dortmund \n Gitmek istediginiz Sehirin numarasini giriniz :  ");
        int sehir = sc.nextInt();

        switch (sehir) {

            case 1:
                System.out.println("Rota = Köln");
                break;
            case 2:
                System.out.println("Rota = Frankfurt");
                break;
            case 3:
                System.out.println("Rota = Dortmund");
                break;

            default:
                System.out.println("Yanlis numara sehir girdiniz.");

        }
        System.out.println(" NOT: 20 KM başına 5 euro bilet parası alınmaktadir.. : ");
        sc.nextLine();
        System.out.println("Gidilecek Sehrin uzaklik mesafesini yaziniz : ");


        double mesafe = sc.nextDouble();
        double toplamTutar = (mesafe / 20) * 5;
        System.out.println("toplam bilet Tutariniz  = " + toplamTutar + "€");

        System.out.println("Kac kisilik bilet istiyorsunuz?  Max 2 kisilik bilet alabilirsiniz.. \n tek kisilik icin 1'e basin\n iki kisilik icin 2 ye basin ");

        int bilet = sc.nextInt();
        if (bilet == 1) {
            System.out.println("tek kisilik bilet ücteriniz  = " + toplamTutar);
        } else if (bilet == 2) {

            System.out.println("iki  kisilik bilet ücteriniz  = " + (toplamTutar * 2));

        } else {
            System.out.println("yanlis giris yaptiniz... ");
        }

        System.out.println("1.Bakiyemi belirtin.\n2.Toplam Tutarı belirtin.\n3.double paraUstu oluşturun ve hesaplayın.\n4.Double para üstünü yazdırın.");
        int check = sc.nextInt();

        switch (check) {
            case 1:
                System.out.println("ilk bakiyenizi giriniz");
                int ilkBakiye = sc.nextInt();
                double sonBakiye = ilkBakiye - toplamTutar;
                System.out.println("son bakiyeniz = " + sonBakiye);
                break;

            case 2:
                System.out.println("toplam Tutariniz  = " + toplamTutar);
                break;

            case 3:
                System.out.print("vermek istediginiz para : ");
                double verilenPara = sc.nextDouble();
                System.out.println("verdiginiz para = " + verilenPara);
                System.out.println("bilet ücretiniz = " + toplamTutar);
                double paraUstu = verilenPara - toplamTutar;
                System.out.println("para üstünüz  = " + paraUstu + " iade ediliyor..");
                break;

            case 4:System.out.print("vermek istediginiz para : ");
                double verilenParam = sc.nextDouble();
                double paraUstum = verilenParam - toplamTutar;
                System.out.println("para üstu = " + paraUstum);
                break;

            default:
                System.out.println("yanlis giris yaptiniz...");


        }


    }
}
