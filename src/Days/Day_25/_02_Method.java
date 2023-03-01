package Days.Day_25;

public class _02_Method {
    public static void main(String[] args) {

        //yazdir(5);
        //yazdir("Ali");
        //yazdir("Ronaldo",37);
        //yazdir(60,"Veli");
        //yazdir(10,5);
        //yazdir("Ali","Veli");
        yazdir(5);
yazdir("veli");
yazdir("Ronaldo",37);


    }
    public static void yazdir(int yas){
        System.out.println(yas);
    }
    public static void yazdir(String name){
        System.out.println(name);
    }
    public static void yazdir(String name,int yas){
        String futbolcu=name+yas;
        System.out.println(futbolcu);
    }
    public static void yazdir(int jahr,String isim){
        String isimYas=jahr+isim;
        System.out.println(isimYas);
    }
    public static void yazdir(int num1, int num2){


    }

}
