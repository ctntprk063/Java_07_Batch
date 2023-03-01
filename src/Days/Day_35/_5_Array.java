package Days.Day_35;

import java.util.Arrays;

public class _5_Array {
    public static void main(String[] args) {

        int[] sayilar = {3, 5, 78, 25, 4, 15, 24};

        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));
        System.out.println("Arrays.binarySearch(sayilar,4) = " + Arrays.binarySearch(sayilar, 78));//  icinde 4 var mi ve indexini verir
        System.out.println("Arrays.binarySearch(sayilar,4) = " + Arrays.binarySearch(sayilar, 17));//  icinde 4 var mi ve indexini verir


        Arrays.fill(sayilar,12);
        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));

        int []sayilar2={ 15,17,19,25,34,7,14};
        System.out.println("Arrays.equals(sayilar2,sayilar) = " + Arrays.equals(sayilar2, sayilar));

        System.out.println("Arrays.stream(sayilar).sum() = " + Arrays.stream(sayilar).sum());

        Arrays.stream(sayilar).forEach(System.out::println);

    }
}
