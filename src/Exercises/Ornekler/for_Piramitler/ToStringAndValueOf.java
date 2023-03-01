package Exercises.Ornekler.for_Piramitler;

public class ToStringAndValueOf {
    public static void main(String[] args) {

        String str1="125";
        String str2="100";

        int val1=Integer.valueOf(str1); // valueOf Stringi int e ceviriyor
        int val2=Integer.valueOf(str2);

        int toplam=val1+val2;
        System.out.println("toplam = " + toplam);


        int parse1=Integer.parseInt(str1);// parseInt de valueOf gibi stringi inte ceviriyor
        int parse2=Integer.parseInt(str2);
        int sum=parse1+parse2;
        System.out.println("sum = " + sum);


        int x=25;
        String toStr=Integer.toString(x); //toString int i stringe ceviriyor
        System.out.println("toStr = " + toStr);



    }
}
