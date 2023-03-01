package Days.Day_35;

import java.util.Scanner;

public class _2_Array {
    public static void main(String[] args) {


        int[] dizi=new int[5]; // test için 5 yaptık

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for(int i=0;i<dizi.length;i++){
            System.out.print((i+1)+".Sayı ginizi=");
            dizi[i]=oku.nextInt();
            toplam=toplam+dizi[i];
        }
    }
}
