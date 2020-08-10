package Mentor.TahirBy;

import java.util.Scanner;

public class Asal_Sayi_2 {
    public static void main(String[] args) {
        // Kullanicidan alinan bir sayinin asal sayi olup olmadigini
        // ve sayiya kadar butun asal sayilari yazdiriniz
        // Sadece 1 e ve kendine bolunebilen sayilara asal sayi denir (Prime number)

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir Sayi giriniz : ");
        int sayi = sc.nextInt();

        int i = 2;  // asal sayi 1 e bolundugu icin sayacimi 2 den baslatiyorum
        boolean isPrime = true;

        while (i<sayi){
        /*
            i döngüde 2 den baslayarak sayimiza kadar sayilari verecek
         */
           if (sayi%i==0) {
               isPrime=false;
               break;        // bu if blogu asal olmayan sayilari bulup isPrime(asal sayi)  false yapiyor
           }

           i++;

        }   if (isPrime==true){
            System.out.println("Asal");

        } else System.out.println("Asal Degil");


    }
}
