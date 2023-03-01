package Days.Day_58_Polymorphism.sekil;

public class ShapeTest {
    public static void main(String[] args) {


        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Square();

        for (Shape shape: shapes){
            System.out.println(shape.getArea());
        }

    }
}
