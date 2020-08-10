package Mentor.ZynpHn;

import java.util.HashSet;

public class HashSet2 {
    /*
    main method altinda bos bir hashset olusturunuz.

    parametresi Integer set ve integer array ve adi elementEkle
 olan bir method yaziniz (return tipi olmayacak)

    yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.
     */
    public static void main(String[] args) {

        HashSet<Integer> intSet = new HashSet<>();

        int[] intArr= {10,27,3,40,57,6,7,8,9,10};

      //  elementEkle(intSet,new int[]{10,27,3,40,57,6,7,8,9,10});
        elementEkle(intSet,intArr);
        print(intSet);


    }

    public static void elementEkle(HashSet<Integer> intSet, int[] intArr){


        for (int element: intArr ) {
            intSet.add(element);
        }

    }
    public static void print(HashSet<Integer> intSet){

        for (int integer : intSet ) {

            System.out.print(integer+ " ");
        }

    }
}
