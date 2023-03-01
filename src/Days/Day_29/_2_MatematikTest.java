package Days.Day_29;

public class _2_MatematikTest {
    public static void main(String[] args) {
        _1_Matematik islem = new _1_Matematik();
        islem.toplama(40, 60);
        double carpmaSonuc = islem.carpma(10, 30);
        System.out.println("carpmaSonuc = " + carpmaSonuc);
        double besUssu = islem.karesi(5, 5);// 5 5 5 5 5
        System.out.println("besUssu = " + besUssu);
    }

}
