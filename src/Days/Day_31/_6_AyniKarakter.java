package Days.Day_31;

import java.util.Scanner;

public class _6_AyniKarakter {
    public static void main(String[] args) {

        // String icinde belirli bir karakterin kac kez tekrarlandigini bulunuz

        String kelime = "Adapazari";
        char karakter = 'a';
        int tekrarSayisi = tekrarSayisi(kelime,karakter);

        System.out.println(karakter + " karakteri " + kelime + " icerisinde "
                + tekrarSayisi + " kez tekrar edilmektedir");
    }

    public static int tekrarSayisi(String str, char ch){
        int counter = 0;

        for(int i=0; i <=str.length()-1; i++){
            if(str.charAt(i) == ch){
                counter++;
            }
        }
        return counter;
    }
}
