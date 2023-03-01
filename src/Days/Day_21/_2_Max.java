package Days.Day_21;

public class _2_Max {
    public static void main(String[] args) {

        int a=2;
        int b=8;
        int buyukSayi=a;
        
        if (b>a&&b>10){
            buyukSayi=b;
        }else if (a>10) {
            buyukSayi = a;
        }else if (a<10 && b<10){
            buyukSayi=0;
        }
        System.out.println("buyukSayi = " + buyukSayi);



    }
}
