package Days.Day_33;

public class _2_IndexOf {
    public static void main(String[] args) {

        String str = "Hello java";
        System.out.println("str.indexOf('l') = " + str.indexOf('l'));
        System.out.println("str.indexOf('e') = " + str.indexOf('e'));
        System.out.println("str.indexOf('a') = " + str.indexOf('a'));

        System.out.println("str.lastIndexOf('a') = " + str.lastIndexOf('a'));
        System.out.println("str.indexOf(\"ava\") = " + str.indexOf("ava"));

        String text=" ey edip adanada ye edip pide";
        System.out.println(text.substring(text.indexOf("edip ")).substring(text.indexOf("edip")));


    }
}
