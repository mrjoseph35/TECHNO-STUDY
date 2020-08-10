package Mentor.TahirBy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_1 {
    public static void main(String[] args) {
        // todo  2 sekilde tanimlanabiliyor

        HashMap<String,String > lhm1 = new LinkedHashMap<>();
        LinkedHashMap<String,String > lhm = new LinkedHashMap<>();

        // todo 5 tane ulke ismi ve nufusunu olusturuyoruz
        // ulke ve nufuslarini yazdiriyoruz
        // sadece ulkeleri yazdiriyoruz
        // sadece nufuslari yazdiriyoruz
        // nufus toplamlarini yazdiriyoruz
        // 50 milyonun altindaki ulke sayisini yazdiriyoruz

        Map<String ,Integer> country = new LinkedHashMap<>();

        country.put("Türkiye",83154997);
        country.put("Almanya",83694929);
        country.put("Italya",60461826);
        country.put("Fransa",65183386);
        country.put("Ispanya",46758267);
        country.put(null,10000000);         // todo bu sekildede tanimlanabiliyor

        System.out.println("Ulkeler ve Nufuslari " +country);   // Yanyana Kume gibi oldu ulke ve nufus

        System.out.print("Ulkeler : "+ country.keySet());       // Sadece  Ulkeleri yanyana yazdiriyor

        System.out.print("Nüfus : "+ country.values());         // Sadece Nufus lari yanyana yazdiriyor

        System.out.println("-------------------------------------");

        for (Map.Entry<String, Integer> ulke :country.entrySet() ) {   // Entry set hepsini aliyor key ve nufus 2 ser bilgi alt alta geliyor

            System.out.println(ulke);                     //    Ulke Türkiye=83154997 seklinde
        }

        // Todo toplam icin 1.Yöntem
        int sum = 0;
        for (Map.Entry<String,Integer> nufus : country.entrySet() ) {

            sum+=nufus.getValue();

        }
        System.out.println("Toplam 1.Yöntem : " + sum );

        // Todo toplam icin 2.Yöntem

        int top=0;
        for(Integer nufus:country.values()){
            top+=nufus;
        }
        System.out.println("Toplam 2.Yöntem : "+top);

        // todo 50 bin den az ulke sayisi 1.Yöntem
        int count=0;
        for (Map.Entry<String,Integer> nufus : country.entrySet() ) {

            if(nufus.getValue()<50_000_000){                             // todo 50_000_000  seklinde de sayi tanimlanabilir
            System.out.println(nufus.getKey()+" : "+nufus.getValue());    // todo 50 milyon alti ulke ve nufusunu yazdiriyor
            count++;
            }
        }
        System.out.println("50000000 dan az nufuslu ulke sayisi 1.Yöntem : " + count);

        int sayac=0;

        // todo 50 bin den az ulke sayisi 2.Yöntem
        for(Integer nufus:country.values()){
            if(nufus<50_000_000)

                sayac++;
        }
        System.out.println("50000000 dan az nufuslu ulke sayisi 2.Yöntem : " + sayac);


    }
}
