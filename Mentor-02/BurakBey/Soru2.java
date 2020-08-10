package Mentor.BurakBey;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        //TODO  3 adet double olusturunuz. bu 3 double toplayiniz
        // Sonucu ekrana yazdiriniz
        // Scanner kullaniniz


        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz : ");
        double sayi1 = input.nextDouble();

        System.out.print("2. Sayiyi Giriniz : ");
        double sayi2 = input.nextDouble();

        System.out.print("3. Sayiyi Giriniz : ");
        double sayi3 = input.nextDouble();

        System.out.println("Islem Sonucunuz = " + (sayi1+sayi2+sayi3));

    }
}
