package Mentor.TahirBy;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task_2 {
    public static void main(String[] args) {
        // Todo TreeMap Kullanarak Bir cumlenin icindeki harflerin kactane oldugunu bulma
        // Task_1 ornegini method kullanarak yapin. parametre String olsun

        Scanner sc= new Scanner(System.in);
        String text = sc.nextLine();

        CharacterSayisi(text);

    }
    public static void CharacterSayisi(String str){

        Map<Character,Integer> karakterVeSayisi = new TreeMap<>();

        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if (karakterVeSayisi.containsKey(c)){
                karakterVeSayisi.replace(c,karakterVeSayisi.get(c)+1);

            }else karakterVeSayisi.put(c,1);

        }
        for (Map.Entry<Character,Integer> karakter : karakterVeSayisi.entrySet()) {

            System.out.println("Karakter = " + karakter.getKey() + " "+ karakter.getValue()+ " tane gecmistir");

        }


    }
}
