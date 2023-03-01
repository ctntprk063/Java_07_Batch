package Exercises.Replit;

public class _48_RemoveSpace {
    /*
    Remove All Extra Space from String
    Input: “ Hello world     I    love         Java ”
    Output: Hello world I love Java
    */

    public static void main(String[] args) {

        String str= " Hello world     I    love         Java ";
//        String s=str.replaceAll("\s+"," ");
//        System.out.println("s = " + s);
        String boslukSil=str.trim();
        System.out.println("boslukSil = " + boslukSil);
        System.out.println("str.replaceAll) = " + boslukSil.replaceAll("\\W+", " "));


    }
}
