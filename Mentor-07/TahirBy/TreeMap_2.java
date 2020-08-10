package Mentor.TahirBy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_2 {
    /*
        10, Java
        20, PHP
        2, Python
        57, C++
        89, C#
        40, Javascript
        Method ile veri ekleyip yazdirdik
         */

    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<>();
        Map<Integer,String> linkedMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();

        printMap(hm);
        printMap(linkedMap);
        printMap(treeMap);

    }

    public static void printMap(Map<Integer,String>map) {

        map.put(10,"Java");
        map.put(20,"PHP");
        map.put(2,"Python");
        map.put(57,"C#");
        map.put(89,"C++");
        map.put(40,"Javascript");


        for ( Map.Entry<Integer,String> entr : map.entrySet() ) {

            System.out.println("Key : " + entr.getKey()+ " value  : " + entr.getValue());

        }

        System.out.println("***************************************");
    }
}
