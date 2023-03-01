package Days.Day_34;

import java.util.Scanner;

public class _3_Array {
    public static void main(String[] args) {

        // Kullanicidan bir urun alip, istenen urunun markette olup olmadigini bildiren bir program yaziniz

        String [] urunler = {"Ekmek", "Peynir", "Zeytin", "Recel", "Bal"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Istediginiz urunu giriniz!");
        String talep = sc.nextLine();

        boolean flag = false;

        for(int i=0; i<urunler.length; i++){
            if (urunler[i].equalsIgnoreCase(talep)) {
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Aradiginiz urun mevcuttur.");
        }else {
            System.out.println("Aradiginiz urun mevcut degildir.");
        }

    }
}
