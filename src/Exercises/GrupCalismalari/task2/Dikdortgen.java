package Exercises.GrupCalismalari.task2;

public class Dikdortgen extends Hesaplamalar {


    public Dikdortgen(double deger1, double deger2) {
        super(deger1, deger2);
    }

    @Override
    public void alanHesapla() {

        double dikdortgenAlan = deger1 * deger2;
        System.out.println("dikdortgenAlan = " + dikdortgenAlan);

    }

    @Override
    public void cevreHesapla() {
        double dikdortgenCevre = deger1 * deger2;
        System.out.println("dikdortgenCevre = " + dikdortgenCevre);
    }
}
