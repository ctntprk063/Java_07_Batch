package Exercises.Ornekler.for_Piramitler;

public class SagaYatik {
    public static void main(String[] args) {

         for (int i= 0; i<= 7; i++)
        {
            for (int j=1; j<=7-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
