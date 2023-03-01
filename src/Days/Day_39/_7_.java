package Days.Day_39;

public class _7_ {
    public static void main(String[] args) {

        int num = 10;
        double num2 = 32.3;
        boolean b = true;

        Integer obj1 = Integer.valueOf(num);
        Double obj2 = Double.valueOf(num2);
        Boolean obj3 = Boolean.valueOf(b);

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
        System.out.println("obj3 = " + obj3);

        if(obj1 instanceof Integer){
            System.out.println(obj1 + " is converted to Wrapper Object");
        }else{
            System.out.println(obj1 + " is not converted to Wrapper Object");
        }

        // Eger object wrapper class in bir objecti degil ise, instanceOf operatoru compiler hatasi veriyor
//        if(obj2 instanceof Integer){
//            System.out.println(obj1 + " is converted to Wrapper Object");
//        }else{
//            System.out.println(obj1 + " is not converted to Wrapper Object");
//        }

    }
}
