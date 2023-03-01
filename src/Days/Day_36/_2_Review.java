package Days.Day_36;

public class _2_Review {
    public static void main(String[] args) {

        System.out.println( remove("AABBCCCDEEEEFFFGHH"));
        System.out.println(remove("abbbccdddttAgggfh"));

    }

    public static String remove(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }

        return result;
    }
}
