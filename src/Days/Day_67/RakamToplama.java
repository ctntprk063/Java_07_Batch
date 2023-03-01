package Days.Day_67;

public class RakamToplama {

    public static void main(String[] args) {

        String str = "35sdg23AD567Ffa";
        int toplam = toplamRakam(str);
        System.out.println("Toplam: " + toplam);


    }
    public static int toplamRakam(String str) {
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                toplam += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return toplam;
    }
}
