package Mentor.BurakBey;

import java.util.Scanner;

public class ArithmeticsOperatorSoru1 {
    public static void main(String[] args) {
        //TODO 2 tane int olusturunuz. Bu iki int i toplayiniz Sonucu ekrana yazdiriniz
        // Scanner kullaniniz

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("Isleminizin Sonucu = " + (sayi1+sayi2));

    }
}
