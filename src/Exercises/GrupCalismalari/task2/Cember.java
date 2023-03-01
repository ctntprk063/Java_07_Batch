package Exercises.GrupCalismalari.task2;

public class Cember extends Hesaplamalar{


    public Cember(double deger1, double deger2) {
        super(deger1, deger2);
    }

    @Override
    public void alanHesapla() {
        double cemberAlan=this.Pi*deger1*deger1;
        System.out.println("cemberAlan = " + cemberAlan);

    }

    @Override
    public void cevreHesapla() {
        double cemberCevre=2*this.Pi*deger1;
        System.out.println("cemberAlan = " + cemberCevre);
    }

}
