package Exercises.Replit;

public class _49_PrintHalfTwice {
    public static void main(String[] args) {

        String str="javada";
        String yarisi=str.substring(0,str.length()/2);
        System.out.println("yarisi = " + yarisi);
        String birlestir=yarisi.concat(yarisi);
        System.out.println("birlestir = " + birlestir);


    }
}
