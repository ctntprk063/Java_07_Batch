package Days.Day_34;

import java.util.Scanner;

public class _2_Array {
    public static void main(String[] args) {
        // Kullanicidan veri alarak bir alis veris listesi olusturunuz

        System.out.println("Alis Veris Listesi....");
        String [] sepet = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen Sepetinize Urun ekleyiniz!");

        for(int i=0; i<sepet.length; i++){
            System.out.println(i+1 + ". urun : ");
            sepet[i] = sc.nextLine();
        }

        System.out.println("Sectiginiz Urun Listesi");

        for(int i=0; i<sepet.length; i++){
            System.out.println(i+1 + ". urun : " + sepet[i]);
        }



    }
}
