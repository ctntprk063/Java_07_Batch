package Exercises.HomeWork.Inheritence_2;

public class Car {
    String araba;
   String tir;
   String canavar;

    public Car(String araba, String tir, String canavar) {
        this.araba = araba;
        this.tir = tir;
        this.canavar = canavar;
    }

    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public void run() {
        System.out.println("vrommm");
    }

}
