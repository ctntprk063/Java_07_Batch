package Days.Day_26;

public class _2_Dogobject {
    public static void main(String[] args) {

        // ClassName    // objectName       // new keyword      // ClassName/Constructor
        _1_Dog_Class             dog        =         new                   _1_Dog_Class();

        _1_Dog_Class dog2 = new _1_Dog_Class();

        _1_Dog_Class dog3 = new _1_Dog_Class();

        // "." operatorunu kullanarak template class taki field ve methodlara ulasabiliyoruz
        dog.ad = "Artis";
        dog.cins = "Dalmacyali";
        dog.renk = "Siyah&Beyaz";
        dog.yas = 6;

        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog.cins = " + dog.cins);
        System.out.println("dog.renk = " + dog.renk);
        System.out.println("dog.yas = " + dog.yas);

        dog.havla();
        dog.isir();
        dog.yemekYe();
        dog.uyu();

        // object uzerinden ulasilan field a yeni deger assign etmek mumkun
        dog.cins = "Doberman";
        System.out.println("dog.cins = " + dog.cins);

        // Ayni methodu projede ihtiyac oldukca tekrardan cagirmak kullanmak mumkun
        dog.havla();
        dog.havla();
        dog.havla();

        // Ayni classdan olusturlmus farkli objectler ayni fieldda farkli degerler tasiyabilir
        dog2.ad = "Max";
        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog2.ad = " + dog2.ad);

        // Default degerler
        // String default deger = null
        System.out.println("dog3.ad = " + dog3.ad);

        // int default deger = 0
        System.out.println("dog3.yas = " + dog3.yas);

        // boolean default value = false
        System.out.println("dog3.evcil = " + dog3.evcil);

        // char default value = //u00000 /
        System.out.println("dog3.cinsiyet = " + dog3.cinsiyet);


    }
}
