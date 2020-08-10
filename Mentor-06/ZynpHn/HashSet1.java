package Mentor.ZynpHn;

import java.util.HashMap;
import java.util.HashSet;

public class HashSet1 {
    /*
    main method altinda bir double hashSet olusturunuz.

    ve bu seti, adi setOlustur ve return tipi hashSet double olan

    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.

    adini toplaminiAl koyacagimiz ve parametre olarak bir String hashSet kabul edecek ayri bir method olusturarak

    hashSetin degerlerinin toplamini alacaksiniz.
     */
    public static void main(String[] args) {

        HashSet<Double> dHash= setOlustur();

        double toplam = toplaminiAl(dHash);

        System.out.println(toplam);


    }

    public static java.util.HashSet<Double> setOlustur(){
        HashSet<Double> dHash= new java.util.HashSet<>();

        dHash.add(3.23);
        dHash.add(3.10);
        dHash.add(5.12);
        dHash.add(10.12);
        dHash.add(23.12);



        return dHash;

    }
    public static double toplaminiAl(HashSet<Double> set){

        double toplam = 0;
        for (Double aDouble : set) {

            toplam += aDouble;

        }
        return toplam;
    }

}
