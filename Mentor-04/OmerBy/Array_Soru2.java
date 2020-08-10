package Mentor.OmerBy;

import java.util.Arrays;

public class Array_Soru2 {
    public static void main(String[] args) {
        /*
        İnt array oluşturunuz ve eleman sayısı 5 olsun.
        Elemanlar random atansın. (10 a kadar - 10 dahil)

        Array'i yazdırınız.     array = [......]

        Daha sonra Array'daki maximum değeri bulunuz ve yazdırınız.

        ÖRN:
        array[2,5,33,67,3]

        maximum değer =67
         */

        int[] array = new int[5];

        for(int i=0; i<array.length; i++){

            array[i]= (int)(Math.random()*10)+1;
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sort Yontemi ile: " + array[array.length-1]);

        // 2.Yöntem

        int max=0;
        for(int i=0; i<array.length; i++){

            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Max Kiyas Yontemi ile: "+max);

    }


}
