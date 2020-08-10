package Mentor.BurakBy;

import java.util.HashMap;
import java.util.Map;

public class HashMap_10 {
    public static void main(String[] args) {

          // todo HashMap bir satira Key leri  bir satira Value lari yazdirin

        HashMap<String ,Integer> map = new HashMap<>();

        map.put("Amazon",        296);
        map.put("Ebay",          301);
        map.put("Saturn",        326);
        map.put("MediaMarkt",    340);
        map.put("Apple Store",   320);


        for (String  key : map.keySet()) {
            System.out.print(key+" ");       // Key lerin hepsini yan yana hepsini yazdiriyor

        }
        System.out.println();

        for (Integer value : map.values()) {
            System.out.print(value+ " ");       // Value lerin hepsini yan yana hepsini yazdiriyor

        }


    }

}
