package Days.Day_58_Polymorphism.sekil;

public class Circle implements Shape{

    public double radius = 2.5;

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
