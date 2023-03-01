package Exercises.Replit;

import java.util.regex.Pattern;

public class _50_FilterString {
  /*  Write a method that filters a given string and return only alphabetic characters as string.
            Example:
    String s = "(((W&e**_lco73me %t%o co!@$,,e >>$@av```~a777.||}{

    Output: Welcome to core Java*/

    public static void main(String[] args) {
        String str="\"(((W&e**_lco73me %t%o co!@$,r,e >>$j@av```~a777.||}{";

//        String filtre=str.replaceAll("[\\d*%.|!@_\"{}$,>`(&~]", "");
//        System.out.println("filtre = " + filtre);
//        String bolme= filtre.substring(0, 11);
//        System.out.println("bolme = " + bolme);
//
//        String ekleme="core Java";
//        System.out.println("ekleme = " + ekleme);
//
//        System.out.println(" son hali=  " + bolme.concat(ekleme));

         // 2.yöntem
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i)==' '){
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);

    }
}
