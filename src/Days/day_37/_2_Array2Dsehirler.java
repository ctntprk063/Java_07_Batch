package Days.day_37;

import java.util.Arrays;

public class _2_Array2Dsehirler {
    public static void main(String[] args) {

        String [][] sehirler={ {"istanbul","ankara","erzurum","Antep","van"}, {"berlin", "munih","köln","hamburg" } ,{"londra"," hull","leeds"} };
        System.out.println("sehirler.length = " + sehirler.length);

        System.out.println("sehirler[0] = " + sehirler[0].length);
        System.out.println("sehirler[1].length = " + sehirler[1].length);
        System.out.println("sehirler[2].length = " + sehirler[2].length);

        System.out.println("Arrays.toString(sehirler) = " + Arrays.toString(sehirler[0]));
        System.out.println("Arrays.toString(sehirler) = " + Arrays.toString(sehirler[1]));
        System.out.println("Arrays.toString(sehirler) = " + Arrays.toString(sehirler[2]));

        for (int i=0; i<3; i++){
            System.out.println("Arrays.toString(sehirler[i]) = " + Arrays.toString(sehirler[i]));
        }





    }
}
