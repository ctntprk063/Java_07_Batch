package Exercises.GrupCalismalari.task2;

public class Kare extends Hesaplamalar {
    public Kare(double deger1, double deger2) {
        super(deger1, deger2);
    }

    @Override
    public void alanHesapla() {
        double alanKare=deger1*deger1;
        System.out.println("alanKare = " + alanKare);
    }

    @Override
    public void cevreHesapla() {
      double cevreKare=deger1*4;
        System.out.println("cevreKare = " + cevreKare);
    }
}
