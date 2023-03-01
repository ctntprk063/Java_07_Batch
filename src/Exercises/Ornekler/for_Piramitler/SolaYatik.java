package Exercises.Ornekler.for_Piramitler;

public class SolaYatik {
    public static void main(String[] args) {
//
//        for (int i=1; i<5; i++){
//
//        }
//
//
//        for (int j = 1; j<i; j++){
//
//                System.out.println("* ");
//            }
//            System.out.println();



        for (int i=0; i<5; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        {
            System.out.print(" "); //print space

        for (int j=0; j<=i; j++ ) //inner loop for number of columns
        {
            System.out.print("* "); //print star
        }

        System.out.println(); //ending line after each row
    }

}
}
