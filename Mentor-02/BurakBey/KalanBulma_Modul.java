package Mentor.BurakBey;

import java.util.Scanner;

public class KalanBulma_Modul {
    public static void main(String[] args) {
        //TODO  iki int in bolumunden kalani yazdiriniz
        // Scanner kullaniniz

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("Isleminizin Sonucu = " + (sayi1%sayi2));

        // TODO sayi%2==0  Cift Sayi
        //TODO  sayi%2==1  Tek Sayi



    }
}
