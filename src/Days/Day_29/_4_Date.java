package Days.Day_29;

import java.time.LocalDate;

public class _4_Date {
    public static void main(String[] args) {

        yasHesapla(1980);

    }

    public  static void yasHesapla(int dogumYili){

        LocalDate localDate= LocalDate.now();
        int yas= localDate.getYear()-dogumYili;
        System.out.println("yas = " + yas);

    }
}
