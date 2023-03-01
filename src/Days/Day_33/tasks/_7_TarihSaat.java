package Days.Day_33.tasks;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class _7_TarihSaat {
//    Write a method that accept the date with time and creates a timeStamp
//    String date = “30/12/2021 17:35:00”
//    timeStamp(date); // 30122021173500

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.of(2021, 12, 30);
        LocalTime zaman = LocalTime.of(17, 35, 00);

        LocalDateTime zamanVeTarih = LocalDateTime.of(tarih, zaman);
        DateTimeFormatter zt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter zt2 = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        String format = zamanVeTarih.format(zt);
        String format2 = zamanVeTarih.format(zt2);

        System.out.println("String date = \""+ format+"\"");
        System.out.println("timeStamp(date); // "+format2);


    }


}
