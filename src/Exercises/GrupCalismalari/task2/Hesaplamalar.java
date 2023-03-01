package Exercises.GrupCalismalari.task2;

public class Hesaplamalar {
    double deger1;
    double deger2;
    final double Pi=3.14;

    public Hesaplamalar(double deger1, double deger2 ) {
        this.deger1 = deger1;
        this.deger2 = deger2;

    }

    public Hesaplamalar() {

    }

    public  void alanHesapla(){}

    public  void cevreHesapla(){}

    public  void showInfo(){
        System.out.println("deger1 = " + deger1);
        System.out.println("deger2 = " + deger2);
        System.out.println("Pi = " + Pi);

    }
}
