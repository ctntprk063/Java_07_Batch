package Days.Day_31;

import java.util.Scanner;

public class _2_CompareString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str1=sc.nextLine();

        System.out.println("lutfen ikinci string  giriniz");
        String str2=sc.nextLine();

        System.out.println("stringler esit mi = " + compareStrings(str1,str2));






    }

    public static boolean compareStrings(String str1, String  str2){
        return str1.length()==str2.length();
    }
}
