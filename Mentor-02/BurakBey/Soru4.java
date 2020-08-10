package Mentor.BurakBey;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        //TODO  1 adet int 2 adet Byte olusturunuz
        // int den 2 Byte cikariniz Sonucu ekrana yazdiriniz
        // Scanner kullaniniz

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        byte sayi2 = input.nextByte();

        System.out.print("3. Sayiyi Giriniz : ");
        byte sayi3 = input.nextByte();

        System.out.println("Islem Sonucunuz = " + (sayi1-(sayi2+sayi3)));



    }

}
