package Mentor.TahirBey;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {

        // rakamla bir sayi yazdir int olsun
        // String olan bir sayi yazdir
        // sonra yazdirdigin sayilarin toplam degerini int olarak bul

        Scanner scan = new Scanner(System.in);

        System.out.print("1 Sayi giriniz : ");
        int num1 = scan.nextInt();
        scan.nextLine();

        System.out.print("String olan bir sayi giriniz : ");
        String num2Str = scan.nextLine();


        int num2 = Integer.parseInt(num2Str);


        int toplam = num1 + num2 ;

        System.out.println("Gridiginiz sayilarin Toplami : " + toplam);
    }
}
