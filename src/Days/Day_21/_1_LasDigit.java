package Days.Day_21;

public class _1_LasDigit {

    public static void main(String[] args) {

        int a = 6;
        int b = 17;
        int c = 25;
        boolean sonRakamAyni = false;

        if ((a % 10 == b % 10) && a % 10 == c % 10)
           sonRakamAyni=true;
        System.out.println("sonRakamAyni = " + sonRakamAyni);
    }
    
}
