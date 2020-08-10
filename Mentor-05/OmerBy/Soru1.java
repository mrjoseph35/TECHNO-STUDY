package Mentor.OmerBy;

import java.util.ArrayList;
import java.util.Collections;

/*

String arrayList oluşturun.

İçerisine Almanya, Italya , Türkiye , Yunanistan , Kanada ekleyin.

reverse   adında  void bir method oluşturun ve parametresi   String arrayList olsun.

Bu method, arrayListteki değerleri tersten sıralasın ve yazdırsın.

methodu çağırın.

Konsoldaki görüntü böyle olmalı:


ilk hali :   [Almanya, İtalya, Türkiye, Yunanistan, Kanada]
Tersten hali :   [Kanada, Yunanistan, Türkiye, İtalya, Almanya]

 */
public class Soru1 {
    public static void main(String[] args) {
        ArrayList<String> ulke = new ArrayList<>();
        ulke.add("Almanya");
        ulke.add("Italya");
        ulke.add("Türkiye");
        ulke.add("Yunanistan");
        ulke.add("Kanada");
        System.out.println("ilk hali: " + ulke);
        reverse(ulke);
    }
    public static void reverse(ArrayList<String> ulke){

        Collections.reverse(ulke);
        System.out.println("Tersten hali: " +ulke);

        //2.Yontem
        for (int i = 0; i <ulke.size() ; i++) {

            Collections.reverse(ulke);

        }
        System.out.println("Tersten hali :   " + ulke);
    }

}

