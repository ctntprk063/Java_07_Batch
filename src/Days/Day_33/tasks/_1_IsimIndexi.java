package Days.Day_33.tasks;

import java.util.Scanner;

public class _1_IsimIndexi {
    public static void main(String[] args) {
//        Write a program that ask user to enter his/her firstname and lastname. Display the number of
//        characters by assigning a variable.

//        Kullanıcıdan adını ve soyadını girmesini isteyen bir program yazınız. sayısını göster
//        bir değişken atayarak karakterler.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter firstname and lastname : ");
        String str =sc.nextLine();
        
        for (int i=0;i<str.length();i++){
            System.out.println( str.charAt(i)+" harfinin indexi = "+ i);
        }
        










    }
}
