package Mentor.BurakBy;

import java.util.HashMap;

public class HashMap_5 {
    public static void main(String[] args) {

          // todo HashMap  .containsKey

        HashMap<String ,String> map = new HashMap<>();

        map.put("Amazon",       "296 Euro");
        map.put("Ebay",         "278 Euro");
        map.put("Saturn",       "300 Euro");
        map.put("MediaMarkt",   "310 Euro");
        map.put("Apple Store",  "340 Euro");

         String key = "Amazon";
     //  String key = "Aldi";
       if(map.containsKey(key)){
           System.out.println("Deger(Value) : " + map.get(key));   // key karsiligindaki value yazdirir

       }else {
           System.out.println("Bu map'de bununla alakali bir sey yok");
       }

        System.out.println("Saturn'de Ipad satiliyor mu?: " +map.containsKey("Saturn"));  // bu sekilde de kullaniliyor




    }

}
