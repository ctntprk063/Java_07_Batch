package Exercises.HomeWork.Inheritence;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.m1());
        System.out.println(car.m2());
        System.out.println(car.run());


        Truck truck = new Truck();
        System.out.println( truck.m1());
        System.out.println(truck.m2());
        System.out.println( truck.run());


        Monster monster = new Monster();

        System.out.println(monster.m1());
        System.out.println(monster.m2());
        System.out.println(monster.run());
    }
}
