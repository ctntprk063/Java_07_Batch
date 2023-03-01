package Exercises.Review.polimorphism;

public class UserTest {

    public static void getObject(User user){

        user.showInfo();

    }




    public static void main(String[] args) {

        User user = new User();
        PremiumUser premiumUser = new PremiumUser("Ahmet", "Turkey", 3000);
        NormalUser normalUser = new NormalUser("Ali", "Almanya");

        user = new PremiumUser("bayram", "TR", 5000);// poliformikObject
        user.showInfo();

        user = new NormalUser("Hasan", "DE");
        user.showInfo();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        getObject(premiumUser);
        getObject(normalUser);
    }
}
