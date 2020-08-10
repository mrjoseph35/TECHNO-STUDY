package Mentor.BurakBy;

import java.util.HashMap;

public class HashMap_6 {
    public static void main(String[] args) {

          // todo HashMap  .containsValue

        HashMap<String ,String> map = new HashMap<>();

        map.put("Amazon",       "296 Euro");
        map.put("Ebay",         "301 Euro");
        map.put("Saturn",       "300 Euro");
        map.put("MediaMarkt",   "310 Euro");
        map.put("Apple Store",  "340 Euro");

        String value= "301 Euro";

        if(map.containsValue(value)){

            System.out.println("Bu fiyatta bir satici bulundu.");
        }else {
            System.out.println("Bu fiyatta bir satici bulunamadi...");
        }

        System.out.println("296 Euroya Ipad var mi?: " + map.containsValue("296 Euro"));


    }

}
