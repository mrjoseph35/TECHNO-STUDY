package Mentor.TahirBy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_1 {
    /*
        10, Java
        20, PHP
        2, Python
        57, C++
        89, C#
        40, Javascript

        ayri ayri veri tanimlayip yazdirdik
         */
    public static void main(String[] args) {
        Map<Integer,String > hm = new HashMap<>();
        hm.put(10,"Java");
        hm.put(20,"PHP");
        hm.put(2,"Python");
        hm.put(57,"C#");
        hm.put(89,"C++");
        hm.put(40,"Javascript");


        for (Map.Entry<Integer,String> entry : hm.entrySet()) {

            System.out.println("Keys : " + entry.getKey() +" value " + entry.getValue());
            // bunun ciktisi satir satir
            /*
            Keys : 2 value Python
            Keys : 20 value PHP
            Keys : 40 value Javascript
            Keys : 57 value C#
            Keys : 89 value C++
            Keys : 10 value Java
             */
            
        }

        System.out.println(hm);   // bunun ciktisi {2=Python, 20=PHP, 40=Javascript, 57=C#, 89=C++, 10=Java}

        System.out.println("***************************************");

        Map<Integer,String > linkedm = new LinkedHashMap<>();
        linkedm.put(10,"Java");
        linkedm.put(20,"PHP");
        linkedm.put(2,"Python");
        linkedm.put(57,"C#");
        linkedm.put(89,"C++");
        linkedm.put(40,"Javascript");


        for (Map.Entry<Integer,String> entry : linkedm.entrySet()) {

            System.out.println("Keys : " + entry.getKey() +" value " + entry.getValue());

        }

        System.out.println(linkedm);
        System.out.println("***************************************");

        Map<Integer,String > treem = new TreeMap<>();
        treem.put(10,"Java");
        treem.put(20,"PHP");
        treem.put(2,"Python");
        treem.put(57,"C#");
        treem.put(89,"C++");
        treem.put(40,"Javascript");

        for (Map.Entry<Integer,String> entry : treem.entrySet()) {

            System.out.println("Keys : " + entry.getKey() +" value " + entry.getValue());

        }

        System.out.println(treem);

    }
}
