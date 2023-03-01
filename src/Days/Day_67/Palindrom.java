package Days.Day_67;


import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();
        if (palindromKontrol(kelime)) {
            System.out.println(kelime + " palindromdur.");
        } else {
            System.out.println(kelime + " palindrom değildir.");
        }
    }

    public static boolean palindromKontrol(String kelime) {
        kelime = kelime.replaceAll("\\W", "").toLowerCase();
        StringBuilder sb = new StringBuilder(kelime);
        sb.reverse();
        return kelime.equals(sb.toString());





    }


}
