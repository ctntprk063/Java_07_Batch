package Exercises.HomeWork.Inheritence_2;


public class CarTest {
    public static void main(String[] args) {

        Car car = new Car("1", " 2", "3");
        car.m1();
        car.m2();
        car.run();

        System.out.println();
        Truck truck = new Truck("k", "l", "m");
        truck.m1();
        truck.m2();
        truck.run();
        System.out.println();

        Monster monster=new Monster("x","y","z");
        monster.m1();
        monster.run();


    }
}
