package Days.Day_38;

public class Kisi {
    String ad;
    String adresi;
    int telNo;

    public void printInfo(){
        System.out.println("Adı         : " + ad);
        System.out.println("Adresi      : " + adresi);
        System.out.println("Telefon No  : " + telNo);
    }
    public void listele(Kisi[] liste){
        for (Kisi eleman:liste){
            eleman.printInfo();
            System.out.println("----------------------------");
        }
    }
    public void isimdenBul(Kisi[] liste, String isim){
        System.out.println("İsimden bul metodu");
        System.out.println("------------------");
        int sayac = 0;
        for (Kisi eleman:liste){
            if(eleman.ad.equals(isim)){
                sayac++;
                eleman.printInfo();
            }
        }
        if (sayac == 0){
            System.out.println("Kayıt bulunamadı.");
        }else System.out.println(sayac + " kişi bulundu.");
    }
}
