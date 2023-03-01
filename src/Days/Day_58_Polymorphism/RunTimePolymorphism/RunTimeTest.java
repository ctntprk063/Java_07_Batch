package Days.Day_58_Polymorphism.RunTimePolymorphism;

public class RunTimeTest {
    public static void main(String[] args) {

        Parent obj=new Parent();
        obj.print();

        Child1 obj1=new Child1();
        obj1.print();

        Child2 obj2=new Child2();
        obj2.print();
    }

}
