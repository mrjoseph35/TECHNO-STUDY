package Mentor.ZeynepHnm;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        //Console uzerinden maximum ve minimum degeri saglayiniz
        // ve buradan gelen rakamlari Math.random() da olmasini istediginiz araliga getiriniz.

        Scanner sc = new Scanner(System.in);

        System.out.print("max degeri giriniz : ");
        int max = sc.nextInt();
        System.out.print("min degeri giriniz : ");
        int min = sc.nextInt();

        int uSayi = (int) (Math.random() * ((max-min)+1)) + min;

        System.out.println("Uretilen Sayi = " + uSayi);
    }
}
