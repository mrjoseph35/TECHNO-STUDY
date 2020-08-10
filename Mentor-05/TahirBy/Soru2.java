package Mentor.TahirBy;

import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {
        /* TODO Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu alin.

        [C, o, n, g, u, r, a, t, u, l, a, t, i, o, n, s]
        [s, n, o, i, t, a, l, u, t, a, r, u, g, n, o, C]
        snoitalutarugnoC
        Cingritilitiins  // o ,a ve u harfini i ye donuster

         */

        String str ="Congratulations";
        String[] arr =str.split("");
        System.out.println(Arrays.toString(arr));

        String[] yeniArr =new String[arr.length];

        int counter = 0;
        for (int i=arr.length-1;i>=0; i--){
            yeniArr[counter++]=arr[i];          // arr son elemani  yeniArr 0 elemani oluyor

        } System.out.println("1.Yntm"+Arrays.toString(yeniArr));

        for (int i = 0; i <arr.length ; i++) {

            yeniArr[arr.length-1-i]=arr[i];

        }System.out.println("2.Yntm"+Arrays.toString(yeniArr));
    }
}
