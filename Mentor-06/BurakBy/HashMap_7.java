package Mentor.BurakBy;

import java.util.HashMap;

public class HashMap_7 {
    public static void main(String[] args) {

          // todo HashMap .get  Spesifik bir Key'i elde eldeetmemize yariyor

        HashMap<String ,String> map = new HashMap<>();
            //   Key            Value              Key'e yapilan hersey Value ya yapilamiyor. farkli turde objeler
        map.put("Amazon",       "296 Euro");
        map.put("Ebay",         "301 Euro");
        map.put("Saturn",       "300 Euro");
        map.put("MediaMarkt",   "310 Euro");
        map.put("Apple Store",  "340 Euro");

        System.out.println("Amazon'da Ipad ne kadar? :  "+map.get("Amazon"));

    }

}
