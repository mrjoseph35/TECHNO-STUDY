package Mentor.BurakBey;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        // TODO 3 tane int olusturunuz. Bu 3 int i bolunuz Sonucu ekrana yazdiriniz
        //  Scanner kullaniniz

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.print("3. Sayiyi Giriniz : ");
        int sayi3 = input.nextInt();

        System.out.println("Girdiginiz Sayilarin Bolumu = " + (sayi1/sayi2/sayi3));
    }
}
