package Days.Day_66;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class _2_PlayerMap {
    public static void main(String[] args) {

        ArrayList<String > players=new ArrayList<>();
        players.add("Messi");

        ArrayList<Integer > numbers=new ArrayList<>();
        numbers.add(10);

        Map<Integer,String> playerNumbers=new LinkedHashMap<>();
        playerNumbers.put(10,"Messi");
        System.out.println("playerNumbers.get(10) = " + playerNumbers.get(10));



    }
}
