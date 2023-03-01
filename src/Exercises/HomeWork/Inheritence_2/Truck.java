package Exercises.HomeWork.Inheritence_2;

public class Truck extends Car {


    public Truck(String araba, String tir, String canavar) {
        super(araba, tir, canavar);
    }

    @Override
    public void  m1(){
        System.out.println("truck 1");
    }
    public void m2(){
       super.m1();

    }
    @Override
    public void run(){
        System.out.print("vrommm ");
       super.run();



    }
}
