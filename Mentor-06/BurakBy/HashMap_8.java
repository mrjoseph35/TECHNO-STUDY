package Mentor.BurakBy;

import java.util.HashMap;

public class HashMap_8 {
    public static void main(String[] args) {

          // todo HashMap Key ve Value yazdirma

        HashMap<String ,String> map = new HashMap<>();

        map.put("Amazon",       "296 Euro");
        map.put("Ebay",         "301 Euro");
        map.put("Saturn",       "300 Euro");
        map.put("MediaMarkt",   "310 Euro");
        map.put("Apple Store",  "340 Euro");

        System.out.println(map.keySet());   // key leri yazdiriyor
        System.out.println(map.values());   // value lari yazdiriyor

    }

}
