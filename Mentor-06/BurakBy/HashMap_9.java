package Mentor.BurakBy;

import java.util.HashMap;
import java.util.Map;

public class HashMap_9 {
    public static void main(String[] args) {

          // todo HashMap Alt alta value yazdirma

        HashMap<String ,String> map = new HashMap<>();

        map.put("Amazon",       "296 Euro");
        map.put("Ebay",         "301 Euro");
        map.put("Saturn",       "300 Euro");
        map.put("MediaMarkt",   "310 Euro");
        map.put("Apple Store",  "340 Euro");


        System.out.println(map.values());   // value lari yazdiriyor
        for (Map.Entry<String,String > entry : map.entrySet()) {

            String value= entry.getValue();
            System.out.println("Value : " + value);

        }

    }

}
