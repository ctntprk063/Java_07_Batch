package Exercises.Ornekler;

import java.text.DecimalFormat;

public class saat2 {

    public static void main(String[] args) {


//
//        for (int saat = 1; saat <= 12; saat++)
//        {
//            for (int dakika = 00; dakika <= 59; dakika++)
//            {
//                for (int saniye = 00; saniye <= 59; saniye++)
//                {
//                    System.out.println(saat + ":" + dakika+ ":" + saniye);
//                }
//            }
//        }

        // Todo Formatli yöntem

        DecimalFormat formatter = new DecimalFormat("00");
        for (int saat = 0; saat < 24; saat++) {
            for (int dakika = 0; dakika < 60; dakika++)
                for (int saniye = 0; saniye < 60; saniye++) {

                    System.out.println(formatter.format(saat) + ":" + formatter.format(dakika) + ":" + formatter.format(saniye));


                }
        }



    }
}
