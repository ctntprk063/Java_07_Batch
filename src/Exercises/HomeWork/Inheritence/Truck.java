package Exercises.HomeWork.Inheritence;

public class Truck extends  Car{

    public String m1(){
        return "truck 1";
    }
    public String m2(){
     return    super.m1();

    } public String run(){

        return    super.run()+" "+super.run();

    }

}
