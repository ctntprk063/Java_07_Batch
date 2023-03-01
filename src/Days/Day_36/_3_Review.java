package Days.Day_36;

import java.util.Scanner;

public class _3_Review {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir cumle veya kelime giriniz: ");
        String cumle = sc.nextLine();
        System.out.print("Bir harf giriniz: ");
        char harf = sc.next().charAt(0);

        harfBul(cumle,harf);
    }

   public static void harfBul(String str,char ch) {
        int sayac = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch) {
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumle veya kelımede " + sayac + " tane '" + ch + "' vardır");
    }

}
