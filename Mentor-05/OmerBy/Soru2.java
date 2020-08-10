package Mentor.OmerBy;

import java.util.ArrayList;
import java.util.Collections;

public class Soru2 {
    /*
Integer ArrayList  a   oluşturun. 10 elemanlı olsun

randomEkle diye bir void method oluşturun.

Bu method, ArrayList'e 0 ile 100 arasında random değerler atasın.

20'den küçük olan elemanları yazdırınız.

20'den küçük eleman yoksa, '20'den küçük eleman yoktur'. yazdırınız.
 */
    public static void main(String[] args) {

        ArrayList<Integer> sayilar= new ArrayList<>();

        randomEkle(sayilar);
    }
    public static void randomEkle(ArrayList<Integer> a){

        int count=0;

        for (int i=0;i<10;i++) {
            a.add((int) (Math.random() * 100 + 1));

            if (a.get(i) < 20) {
                System.out.println("20 den kucuk olanlar: " + a.get(i));
                count++;
            }
        }
        Collections.sort(a);
        if (count==0) {
            System.out.println("20 den kucuk elaman yoktur");
        }
        System.out.println();
        System.out.println("Arraylist a= "+ a);

    }
}
