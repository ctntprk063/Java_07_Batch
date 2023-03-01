package Exercises.Review.polimorphism;

public class NormalUser  extends User{
   

    public NormalUser(String name, String cauntry) {
        super(name, cauntry);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
