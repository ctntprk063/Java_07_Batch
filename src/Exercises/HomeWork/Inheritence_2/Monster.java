package Exercises.HomeWork.Inheritence_2;


public class Monster extends Car {

    public Monster(String araba, String tir, String canavar) {
        super(araba, tir, canavar);
    }

    @Override
    public void m1() {
        System.out.println("monster 1");
    }

    public void m2() {
        Truck truck = new Truck("a", "b", "c");
        truck.m1();
        super.m1();
    }
    @Override
    public void run() {
        System.out.print("monster ");
        Truck truck = new Truck("a", "b", "c");
        truck.run();
    }
}
