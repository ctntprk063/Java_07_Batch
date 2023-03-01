package Days.Day_35;

import java.util.Arrays;

public class _7_ArrayReverse {
    public static void main(String[] args) {

        int[] sayilar = {10, 5, 50, 90, 100};
        //reverse array
        int say=0;
        int[] reverse = new int[sayilar.length];
        for(int i=sayilar.length-1;i>=0;i--){
            System.out.println("sayilar[i] = " + sayilar[i]);
            reverse[say]=sayilar[i];
            say++;
        }
        System.out.println("Arrays.toString(reverse) = " + Arrays.toString(reverse));




    }
}