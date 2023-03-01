package Days.Day_33.tasks;

import java.util.Scanner;

public class _2_TekrarEdenDegeriSilme {
    /*Write a return method that can remove the duplicated values from String
    Ex:  removeDuplicated("DDEECGDDEEEEFGGDCDD")  ==> DECGF

    Yinelenen değerleri String'den kaldırabilecek bir dönüş yöntemi yazın*/

    public static void main(String[] args) {


        String harfler = "DDEECGDDEEEEFGGDCDD";
        String str = "";
        for (int i = 0; i < harfler.length(); i++) {
            if (!str.contains(String.valueOf(harfler.charAt(i)))) {
                str += String.valueOf(harfler.charAt(i));
            }
        }
        System.out.println(str);


       /* Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = "";
        char c;
        for(int i = 0; i < str1.length(); i++)
        {
            c = str1.charAt(i);
            str2 = str2 + c;
            str1 = str1.replace(c, ' ');
            if(i == str1.length() - 1)
            {
                System.out.println(str2.replaceAll(str1, ""));
            }
        }*/






//        String kelime = "DDEECGDDEEEEFGGDCDD";
//        int kelimeninUzunlugu = kelime.length();
//        String sadelesmisKelime = "";
//        System.out.println("Kelimenin normal hali: " + kelime);
//        for(int i = 0 ; i < kelimeninUzunlugu ; i++) {
//            char harf1 = kelime.charAt(i);
//            char harf2 = ' ';
//            if(i != kelimeninUzunlugu - 1) {
//                harf2 = kelime.charAt(i + 1);
//            }
//            if(harf1 != harf2) {
//                sadelesmisKelime += harf1;
//            }
//        }
//
//        System.out.println("Kelimenin sadeleşmiş hali: " + sadelesmisKelime);


//        String kelime = "DDEECGDDEEEEFGGDCDD"; // Sadeleştirilecek kelime.
//        int kelimeninUzunlugu = kelime.length(); // Sadeleştirilecek kelimenin uzunluğu.
//        String sadelesmisKelime = ""; // Sadeleştirilecek kelimenin sadeleşmiş halinin yazılacağı kelime.
//        System.out.println("Kelimenin normal hali: " + kelime); // Kelimenin normal hali konsola yazdırılıyor.
//        for(int i = 0 ; i < kelimeninUzunlugu ; i++) { // Kontrol döngüsü.
//            char harf1 = kelime.charAt(i); // Seçilen 1. harf.
//            char harf2 = ' '; // Kontrol döngüsü sırasında dizinin(kelime uzunluğunun) dışına çıkma olasılığına karşı hiçbirşeye eşitlenmeyebilir, bu yüzden ilk olarak boşluk'a eşitleniyor.
//            if(i != kelimeninUzunlugu - 1) { // Dizinin dışına çıkma olasılığına karşı kontrol.
//                harf2 = kelime.charAt(i + 1); // Seçilen 2. harf.
//            }
//            if(harf1 != harf2) { // 1. harf, 2. harf'e eşit değilse...
//                sadelesmisKelime += harf1; // 1. harf sadeleşmiş kelime'ye ekleniyor.
//            }
//        }
//
//        System.out.println("Kelimenin sadeleşmiş hali: " + sadelesmisKelime); // Kontrol döngüsü bittikten sonra sadeleşmiş kelime konsola yazdırılıyor.
//


    }
}
