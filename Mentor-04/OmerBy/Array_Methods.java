package Mentor.OmerBy;

import java.util.Arrays;

public class Array_Methods {
    public static void main(String[] args) {
        // todo Arrays.toString() Methodu

        System.out.println("\n -- 2. Arrays.toString() Metodu --- \n");

        int[] a={1,2,3,4,5};

        System.out.println(Arrays.toString(a));

        // todo Arrays.fill() Methodu

        System.out.println("\n -- 2. Arrays.fill() Metodu --- \n");

        int[] liste = {1,4,7,8,9,10};

        System.out.println("Array ilk hali: " +Arrays.toString(liste));
        Arrays.fill(liste,4);

        System.out.println("Array in sonraki hali : " +Arrays.toString(liste));

        // degistirilecek degerin hangi aralikta oldugunu belirleyebiliriz

        int[] liste1 = {1,4,7,8,9,10};


        Arrays.fill(liste1,2,4,99);
        //fill.Objeck from seciyoruz  ilk index no dahil, ikinci index dahil degil

        System.out.println("sifir dort arasindaki indexleri 99 ile degistir"+Arrays.toString(liste1));

        // todo Arrays.sort() Methodu
        //
        System.out.println("\n -- 2. Arrays.sort() Metodu --- \n");

        int[] liste2 = {88,77,25,66,31,22,3};

        Arrays.sort(liste2);
        System.out.println(Arrays.toString(liste2));

        // belirli bir araligi kucukten buyuge siralar

        int[] liste3 = {88,77,25,66,31,22,3};

        System.out.println(Arrays.toString(liste3));
        Arrays.sort(liste3,0,3);        //0 dan 3 index kadar olan yeri siraliyor
        System.out.println(Arrays.toString(liste3));

        String[] dizi = {"x","q","u","a","c","b","z"};

        System.out.println("Ilk hali: " +Arrays.toString(dizi));
        Arrays.sort(dizi,0,4);
        System.out.println("Sonraki hali: " + Arrays.toString(dizi));

            // todo Arrays.equals() Methodu
        //
        System.out.println("\n -- 2. Arrays.equals() Metodu --- \n");

        String[] x = {"Techno" , "Study" , "Avrupa"};
        String[] y = {"Study" , "Avrupa" , "Techno"};
        String[] z = {"Techno" , "Study" , "Avrupa"};

        System.out.println(Arrays.equals(x,y));
        System.out.println(Arrays.equals(x,z));

        // todo Arrays.binarySearch() Methodu
        // bu method sadece sirali dizilerde calisir. Eger dizinin elemanlari sirali degilse
        // once sort edip sonra
        System.out.println("\n -- 2. Arrays.binarySearch() Metodu --- \n");

        int[] d = {22,1,37,4,5,3,7};

        int degisken = Arrays.binarySearch(d,3);
        System.out.println("Siralamadan once: " + degisken);
        Arrays.sort(d);
        degisken= Arrays.binarySearch(d,3);  // siralamda 3 un index veriyor
        System.out.println(Arrays.toString(d));
        System.out.println("Siralamadan sonra: " + degisken);


    }
}
