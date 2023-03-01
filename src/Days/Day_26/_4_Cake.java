package Days.Day_26;

public class _4_Cake {
    String baker;
    int slices;
    boolean isChoclate;
    static int cakeSlice = 20;// static oldugu icin classta bir pasta sürekli bir dilim eksiliyor

    public void eat(){
        slices--;
        System.out.println(baker + "'s cake slice : " + slices);
        cakeSlice--;
        System.out.println("Cake Slices : " + cakeSlice);
    }

}
