package Days.Day_33;

public class _1_Substring {
    public static void main(String[] args) {
        
        
        String takim="Fenerbahce";
        System.out.println("takim.substring(3) = " + takim.substring(3));// 3. index ve sonrasini alir

        System.out.println("takim.substring(2,6) = " + takim.substring(2,6)); // verilen indexler arasinda alir   Not: ilk index dahil ama son index dahil degil

        String text="Merhaba Java";

        System.out.println(text.substring(6, text.length()));
        
        
    }
}
