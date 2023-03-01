package Days.Day_24;

public class _2_Method {

    public static void main(String[] args) {

        System.out.println(ya$(1923));

        System.out.println(onsekiYas(20));
    }

    private static int ya$(int dogum) {
        int kacYasinda = 2022 - dogum;

        return kacYasinda;


    }

    public static boolean onsekiYas(int dogum) {

        if (dogum > 18) {

        }
        return true;
    }


}
