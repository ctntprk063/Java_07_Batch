package Projects.project_1;

import java.util.Scanner;

public class countE {

    /*
    Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin

        char bHarfi='b';
        int sayac=0;

        for (int i=0; i<text.length(); i++){
            if (text.charAt(i)==bHarfi){
                sayac++;
            }

        }
        System.out.println(bHarfi+ " bu cümlede " + sayac + " tanedir.");



     /*   int i=0;
        int bharfisaysi=0;
        while(i<text.length()) {

            if (text.charAt(i)=='b'){
                bharfisaysi++;}

            i++;}

        System.out.println(bharfisaysi+" tane b harfi var");*/

    }
}
