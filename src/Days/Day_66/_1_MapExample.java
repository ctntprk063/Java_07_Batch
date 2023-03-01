package Days.Day_66;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _1_MapExample {

    public static void main(String[] args) {

  //  Map<String, Integer> map=new TreeMap<>();
    Map<String, Integer> map1=new HashMap<>();
   // Map<String, Integer> map2=new LinkedHashMap<>();

   // map.put("tree",15);
    map1.put("A",20);
    map1.put("B",30);
    map1.put("C",40);
   // map2.put("Linked",25);
    //    System.out.println("map = " + map.get(15));
        System.out.println("map1 = " + map1.get("A"));
     //   System.out.println("map2 = " + map2);


    }
}
