package Days.Day_31.tasks1;

import java.util.Scanner;

public class _4_SesliHarfler {
//    Write a program to print only vowel (a,e,o,i,u) in given string
//    String word = “Hello World";
//    Output: e,o,o

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("isim ve soyadinizi yaziniz:  ");
        String str = sc.nextLine();

        for (int i=0; i<str.length();i++){
            if (str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
            str.charAt(i)=='A'|| str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){

                //System.out.println("sesli harfler : " +str.charAt(i) +" kacinci harf : " +i);
                System.out.print(str.charAt(i)+"," );
            }



        }







    }
}
