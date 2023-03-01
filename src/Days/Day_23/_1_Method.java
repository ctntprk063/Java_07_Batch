package Days.Day_23;

public class _1_Method {
    public static void main(String[] args) {

        faktoryel(5);

    }

    public static void faktoryel(int num) {
        int faktoriyel = 1;
        for (int i = 1; i <= num; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(num + "!= " + faktoriyel);

    }


}
