package Mentor.OmerBey;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        /*
        ÇİFT - TEK SAYI BULMA

        Sistem bize "Bir sayı giriniz" diye sorsun.

       İnt değerinde bir sayı giriniz.

      Eğer sayı çiftse      "Çift Sayı..   Kalan ->> 0'dır.

      Eğer sayı tekse       "Tek Sayı.. Kalan ->>1'dir.

         */

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi1 = input.nextInt();

        if (sayi1%2==0) System.out.println("Çift Sayı..   Kalan ->> 0");
        else System.out.println("Tek Sayı.. Kalan ->>1");



    }
}
