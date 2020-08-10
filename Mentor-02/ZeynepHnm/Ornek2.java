package Mentor.ZeynepHnm;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        //TODO ORNEK2

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //ikinci ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


        Scanner sc = new Scanner(System.in);

        System.out.print("1. String Kelimeyi Yaziniz : ");
        String str1 = sc.nextLine();
        String str1IlkharfYok = str1.substring(1);


        System.out.print("2. String Kelimeyi Yaziniz : ");
        String str2 = sc.nextLine();
        String str2IlkharfYok = str2.substring(1);

        String birlesik = str1.concat(str2);
        String str1_Str2 = str1IlkharfYok.concat(str2IlkharfYok);

        System.out.println("2 String birlesik = " + birlesik);
        System.out.println("Ilk Harfler olmadan birlesik = " + str1_Str2);




    }
}
