package Mentor.BurakBy;

import java.util.HashMap;
import java.util.Map;

public class HashMap_11 {
    public static void main(String[] args) {

          // todo HashMap Value lari toplama

        HashMap<String ,Integer> map = new HashMap<>();

        map.put("Amazon",        296);
        map.put("Ebay",          301);
        map.put("Saturn",        326);
        map.put("MediaMarkt",    340);
        map.put("Apple Store",   320);


       int total = 0;

        for (Map.Entry<String ,Integer> sum : map.entrySet()) {
            int fiyat = sum.getValue();

            total+= fiyat;
        }
        System.out.println("Fiyatlarin toplami : " + total);

    }

}
