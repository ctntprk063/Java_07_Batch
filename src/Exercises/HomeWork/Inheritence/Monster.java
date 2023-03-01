package Exercises.HomeWork.Inheritence;

public class Monster extends Car {

    public String m1() {
        return "monster 1";
    }
    public String m2() {
        Truck truck = new Truck();

        return truck.m1() + " " + super.m1();
    }
    public String run() {

        return "monster  " + super.run() + " " + super.run();
    }
}
