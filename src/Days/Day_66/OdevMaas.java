package Days.Day_66;

import java.util.HashMap;
import java.util.Map;

public class OdevMaas {

    public static void main(String[] args) {
        Map<String, Integer> salary = new HashMap<>();

        salary.put("Ali", 5000);
        salary.put("Veli", 3000);
        salary.put("Ahmet", 6000);
        salary.put("Ayse", 3500);
        salary.put("Fatma", 6200);

        String enYuksekMaasAlan = "";
        int enYuksekMaas = 0;

        for (Map.Entry<String, Integer> entry : salary.entrySet()) {
            if (entry.getValue() > enYuksekMaas) {
                enYuksekMaas = entry.getValue();
                enYuksekMaasAlan = entry.getKey();
            }
        }

        System.out.println("En yüksek maaş alan kişi: " + enYuksekMaasAlan + "    Maaşı: " + enYuksekMaas);


    }
}
