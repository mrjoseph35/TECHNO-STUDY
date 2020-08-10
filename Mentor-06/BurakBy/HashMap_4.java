package Mentor.BurakBy;

import java.util.HashMap;

public class HashMap_4 {
    public static void main(String[] args) {

          // todo HashMap bosaltma .clear()  metodu

        HashMap<String ,String> map = new HashMap<>();

        map.put("Amazon",       "296 Euro");
        map.put("Ebay",         "278 Euro");
        map.put("Saturn",       "300 Euro");
        map.put("MediaMarkt",   "310 Euro");
        map.put("Apple Store",  "340 Euro");

        System.out.println(".clear dan once = "+map);
        map.clear();
        System.out.println(".clear dan sonra = "+map);
        System.out.println("map bosmu = " + map.isEmpty());

    }

}
