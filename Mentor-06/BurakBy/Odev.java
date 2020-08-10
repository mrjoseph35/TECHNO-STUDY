package Mentor.BurakBy;

import java.util.HashMap;
import java.util.Map;

public class Odev {
    public static void main(String[] args) {
        //todo            Hashmap -------- ÖDEV -----------

        //15. --- Çıktısı böyle olsun ---
        // Kiraz 100
        // İncir 200
        // Enginar 150
        // Üzüm 145
        // Nar 250

        //        System.out.println("Kiraz 100");
        //        System.out.println("İncir 200");
        //        System.out.println("Enginar 300");

        //Böyle yazmayın tabi :)

        Map<String ,Integer> hsm= new HashMap<>();

        hsm.put("Kiraz",100);
        hsm.put("Incir",200);
        hsm.put("Enginar",150);
        hsm.put("Üzüm",145);
        hsm.put("Nar",250);

        for (Map.Entry<String,Integer> sirali : hsm.entrySet()) {

            System.out.println(sirali.getKey()+" : " + sirali.getValue());
        }

    }
}
