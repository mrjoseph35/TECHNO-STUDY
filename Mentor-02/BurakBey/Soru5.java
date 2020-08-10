package Mentor.BurakBey;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        // TODO 2 tane int olusturunuz. Bu iki int i bolunuz Sonucu ekrana yazdiriniz
        //  Scanner kullaniniz

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("Girdiginiz Sayilarin Bolumu = " + (sayi1/sayi2));
    }
}
