package Exercises.GrupCalismalari.task2;

import Days.Day_58_Polymorphism.sekil.Shape;

public class HesaplamalarTest  {
    public static void main(String[] args) {

        Kare kare = new Kare(10, 20);
        kare.alanHesapla();
        kare.cevreHesapla();
        kare.showInfo();

        Cember cember = new Cember(10, 20);
        cember.alanHesapla();
        cember.cevreHesapla();
        cember.showInfo();

        Dikdortgen dikdortgen=new Dikdortgen(15,20);
        dikdortgen.alanHesapla();
        dikdortgen.cevreHesapla();
        dikdortgen.showInfo();



    }


}
