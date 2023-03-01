package Exercises.Replit;

public class _45_UniqueCharInString {
    /*Write a return method that can find the unique characters from the String
    Example:
    unique("AAABBBCCCDEF")
    output:
    DEF*/


    public static void main(String[] args) {
        System.out.println(uniqueChar("AAABBBCCCDEF"));


    }

    public static String uniqueChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int karakterSayisi = 0;
            for (int j = 0; j < str.length(); j++) {
                if (result.charAt(i) == result.charAt(j) && i != j) {
                    karakterSayisi = 1;
                    break;
                }
            }
            //if (karakterSayisi == 0)
               // System.out.print(str.charAt(i));
        }


        return result;
    }
}
