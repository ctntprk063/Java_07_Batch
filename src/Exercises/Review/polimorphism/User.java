package Exercises.Review.polimorphism;

public class User {
  public String name;
  public String cauntry;

    public User() {
    }

    public User(String name, String cauntry) {
        this.name = name;
        this.cauntry = cauntry;
    }

    public void showInfo(){
        System.out.println("name  : "+ this.name);
        System.out.println("cauntry  : "+ this.cauntry);
  }
}
