package Mentor.BurakBy;

import java.util.HashMap;

public class HashMap_3 {
    public static void main(String[] args) {

          // todo HashMap kopyalama  metodu

        HashMap<String ,String> map = new HashMap<>();

        map.put("Amazon",       "296 Euro");
        map.put("Ebay",         "278 Euro");
        map.put("Saturn",       "300 Euro");
        map.put("MediaMarkt",   "310 Euro");
        map.put("Apple Store",  "340 Euro");

        HashMap<String ,String> map2= new HashMap<>();

        System.out.println("------1.Yol------");

        map2= new HashMap<>(map);
        System.out.println("map2 = " + map2);

        System.out.println("------2.Yol------");

        map2.putAll(map);
        System.out.println("map2 = "+map2);




    }

}
