package Mentor.TahirBy;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task_1 {
    public static void main(String[] args) {
        // Todo TreeMap Kullanarak Bir cumlenin icindeki harflerin kactane oldugunu bulma

        Scanner sc= new Scanner(System.in);
        String text = sc.nextLine();

        Map<Character,Integer> frekans = new TreeMap<>();


        for (int i = 0; i <text.length() ; i++) {
            char c= text.charAt(i);

            if(frekans.containsKey(c)){
                frekans.replace(c,frekans.get(c)+1);    //  frekans.put(c,i);
                // eger daha once bu karakter varsa 1 arttir
            } else frekans.put(c,1);

        }

        for (Map.Entry<Character,Integer> entry : frekans.entrySet()) {

            System.out.println("Karakter " + entry.getKey() + " " + entry.getValue()+ " kadar geciyor");

        }
        
        
    }
}
