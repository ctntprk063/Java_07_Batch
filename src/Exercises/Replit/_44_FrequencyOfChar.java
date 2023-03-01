package Exercises.Replit;

public class _44_FrequencyOfChar {

   /* Write a return method that can find the frequency of characters
    Example:
    input : AAABBCDD
    Output : A3B2C1D2*/


    public static void main(String[] args) {
        System.out.println("frequency(\"AAABBCDD\") = " + frequency("AAABBCDD"));

    }

    public static String frequency(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }

        String expected = "";
        for (int i = 0; i < result.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (result.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            expected += result.charAt(i) + "" + counter;
        }
        return expected;
    }
}
