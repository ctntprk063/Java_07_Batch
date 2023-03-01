package Days.Day_36;

import java.util.Arrays;

public class _5_Review {
    public static void main(String[] args) {
        int[] x = {3,4,5,6,12,8}; // 12
        int[] y = {14,22,35,12,41}; // 41
        int[] z = {0,5,28,1,76,0,1}; // 76


        System.out.println(Arrays.toString(sumElements(x, y)));


    }
    public static int[] sumElements( int[] arr1, int[] arr2){

        int  sum1=0;
        int  sum2=0;

        for (int i=0; i<arr1.length; i++){
            sum1+=arr1[i];
        }
        for (int value : arr2){
            sum2+=value;
        }
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        if (sum1>sum2){
            return arr1;
        }
        else return arr2;







    }
}
