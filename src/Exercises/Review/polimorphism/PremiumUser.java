package Exercises.Review.polimorphism;

public class PremiumUser extends User {
    public  int price;

    public PremiumUser(String name, String cauntry, int price) {
        super(name, cauntry);
        this.price=price;
    }
    public  void showInfo(){
        super.showInfo();
        System.out.println(  this.price);
    }

}
