package Mentor.BurakBy.Arrays;

import java.util.EventListener;
import java.util.Scanner;

public class d_Arrays {
    public static void main(String[] args) {

        // Todo Scanner ile Array elemanlarini girme

        Scanner sc = new Scanner(System.in);

            int[] Elma = new int[5];
            int tplm = 0;

            // Array in degerlerinigirme
        System.out.println("Array elemanlarini Giriniz: ");
        for (int i=0; i<Elma.length; i++){
            Elma[i] = sc.nextInt();
        }
            // Array in degerlerini yazdirma
        System.out.println("Array'in degerleri yazdiriliyor" );

        for (int i=0; i<Elma.length; i++){

            System.out.println("Eleman: " + Elma[i]);
        }

        // Array in degerlerinin ortalamasini alma
        for (int i=0; i< Elma.length; i++){
            tplm+=Elma[i];
        }
        int ort = tplm/Elma.length;
        System.out.println("Arrayin Elemanlarinin ort : " + ort);
    }

}
