package Mentor.TahirBey;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {

        // iki vize ve bir final olan sisteme not ortalamasi
        // vizelerin ortalamsinin %30  ve final %70 i not ortalamayi verir

        Scanner scan = new Scanner(System.in);


        System.out.println("*****Not Ortalama Sistemi*****");
        System.out.print("1.Vize Notunuzu Giriniz : ");
        int vizeNotu1 = scan.nextInt();

        System.out.print("2.Vize Notunuzu Giriniz : ");
        int vizeNotu2 = scan.nextInt();

        System.out.print("Final Notunuzu Giriniz : ");
        int finalNotu = scan.nextInt();

        double vizeOrt = (vizeNotu1+vizeNotu2)/2;

        double ortalama =(vizeOrt *0.3) + (finalNotu * 0.7);

        System.out.println("Ortalamaniz = " +ortalama );

    }
}
