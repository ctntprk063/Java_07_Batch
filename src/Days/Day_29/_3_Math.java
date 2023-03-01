package Days.Day_29;

import  static java.lang.Math.*; // bunu import edince artik class ismi yazmaya gerek yok
public class _3_Math {

    public static void main(String[] args) {

        int rastgele=(int) (Math.random()*6);
        System.out.println("rastgele = " + rastgele);
        System.out.println("Math.sqrt(50) = " + Math.sqrt(50));




        int a= 20;
        int b= 30;
        int c= 45;

        System.out.println("enkucuk = " + Math.min(a, Math.min(b,c)));

        System.out.println("kucuk sayi : "+kucukSayi(40,80,55));

        System.out.println("min(80,60) = " + min(80, 60));// yukarda import yapildigi icin Math clasina gerek kalmadi


    }

public  static double kucukSayi(int a, int b, int c){

      int kucuk=  Math.min(c,Math.min(a,b));

return kucuk;

}

}
