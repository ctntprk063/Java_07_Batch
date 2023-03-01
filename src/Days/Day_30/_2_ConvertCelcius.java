package Days.Day_30;

import java.util.Scanner;

public class _2_ConvertCelcius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir Celcius deger giriniz!");
        double celcius = input.nextDouble();

        double fahreneit = convertCelcius(celcius);

        System.out.println(celcius + " celcius = " + fahreneit + " fahreneit");

    }

    public static double convertCelcius(double celcius){
        return (9.0 / 5) * celcius + 32;
    }
}