package Projects.kucukProjeler.kaffeMaschine;

import java.util.Scanner;

public class Kahve_Islemler {
    Scanner sc = new Scanner(System.in);

    public void kahveCesidi() {
        System.out.println("Hangi Kahveyi istersiniz? \n 1.Türk kahvesi \n 2.Filtre Kahve\n 3.Espresso ");
        System.out.print("istediginiz kahvenin numarasini giriniz : ");

        int kahve = sc.nextInt();

        switch (kahve) {
            case 1:
                System.out.println("Türk kahvesi hazırlanıyor.");
                break;
            case 2:
                System.out.println("Filtre kahve hazırlanıyor.");
                break;
            case 3:
                System.out.println("Espresso hazırlanıyor...");
                break;
            default:
                System.out.println("Hatali tuslama yaptiniz..");
        }
        System.out.println("----------------------------------------------------");

    }

    public void sutSecimi() {

        System.out.println("Süt eklememizi istermisiniz ; ");
        System.out.print("(Evet veya Hayır olarak cevaplayınız): ");

        String sut = sc.next();


        switch (sut.toLowerCase()) {

            case "evet":
                System.out.println("Süt ekleniyor...");
                break;
            case "hayir":
                System.out.println("Süt eklenmiyor...");
                break;
            default:
                System.out.println("hatali tuslama yaptiniz ");
        }

        System.out.println("----------------------------------------------------");

    }

    public void sekerSecimi() {
        System.out.print("Seker eklemek istermisiniz? \nevet veya hayir olarak yaziniz  : ");
        String seker = sc.next().toLowerCase();
        if (seker.equals("evet")) {
            System.out.print("Kac seker eklemek istersiniz? (En fazla 5 adet seker eklenebilir) :  ");
            int sekerAdedi = sc.nextInt();
            if (sekerAdedi == 1) {
                System.out.println(sekerAdedi + " seker ekleniyor");
            } else if (sekerAdedi == 2) {
                System.out.println(sekerAdedi + " seker ekleniyor");
            } else if (sekerAdedi == 3) {
                System.out.println(sekerAdedi + " seker ekleniyor");
            } else if (sekerAdedi == 4) {
                System.out.println(sekerAdedi + " seker ekleniyor");
            } else if (sekerAdedi == 5) {
                System.out.println(sekerAdedi + " seker ekleniyor");
            } else {
                System.out.println(sekerAdedi + " seker ekleniyor");
            }


        } else if (seker.equals("hayir")) {
            System.out.println("seker eklenmiyor");
        }

        System.out.println("----------------------------------------------------");
    }

    public  void kahveBoyutu(){

//        System.out.println("Kahveniz hangi boyutta olsun?  \n Buyuk Boy \n Orta Boy\n Kucuk boy");
//        String boyut=sc.nextLine();
//
//        if (boyut.toLowerCase().equals("buyuk boy")){
//            System.out.println(boyut+ " kahveniz hazirlaniyor...");
//        } else if (boyut.toLowerCase().equals("orta boy")) {
//            System.out.println(boyut+ " kahveniz hazirlaniyor...");
//        }else if (boyut.toLowerCase().equals("kucuk boy")) {
//            System.out.println(boyut+ " kahveniz hazirlaniyor...");
//       }
//        else{
//            System.out.println("hatali giris yaptiniz ");
//        }
//
//



        System.out.println("Kahveniz hangi boy olsun?\n1-Buyuk\n2-Orta\n3-Kucuk");
        String boy=sc.next();

        switch (boy){
            case "buyuk":
                System.out.println(boy+" boy kahveniz hazirlaniyor...");break;
            case "orta":
                System.out.println(boy+" boy kahveniz hazirlaniyor...");break;
            case "kucuk":
                System.out.println(boy+" boy kahveniz hazirlaniyor...");break;
            default:
                System.out.println("hatali giris yaptiniz lutfen tekrar deneyin");
        }

        System.out.println("***ISLEMİNİZ TAMAMLANİYOR......***");
        System.out.println(".....................");
        System.out.println("isleminiz tamamlandi afiyet olsun...");

    }

}
