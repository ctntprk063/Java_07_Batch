package Days.Day_58_Polymorphism.sekil;

public class Square implements  Shape {

    public double side=5.0;

    @Override
    public double getArea() {
        return side*side;
    }
}
