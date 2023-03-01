package Days.Day_26;

public class _5_CakeTest {


    public static void main(String[] args) {

        _4_Cake cake1 = new _4_Cake();
        cake1.isChoclate = true;
        cake1.slices = 10;
        cake1.baker = "Ayse";

        _4_Cake cake2 = new _4_Cake();
        cake2.isChoclate = false;
        cake2.slices = 10;
        cake2.baker = "Murat";

        cake1.eat();
        cake1.eat();
        cake2.eat();
        cake2.eat();

    }
}
