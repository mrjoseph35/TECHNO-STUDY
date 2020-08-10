package Mentor.BurakBey.Do_While_Loop;

import java.util.Scanner;

public class Do_While_Loop4 {
    public static void main(String[] args) {

        // Todo  -----Girilen Sayinin Basamaklarindaki Rakamlarin Toplamini Bulunuz

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir SAyi Gririniz : ");
        int sayi = sc.nextInt();

        int toplam = 0;

        do {

            toplam+=sayi %10;
            sayi = sayi/10 ;

            System.out.println("Basmagin Toplami = " + toplam + " kalan sayi " + sayi);

        }while ( sayi > 0);

        System.out.println("Toplam = " + toplam);
    }
}
