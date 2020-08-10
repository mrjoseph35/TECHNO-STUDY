package Mentor.OmerBey;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
/*          todo      Else İf


        bir değişken birden fazla koşul alıyorsa else if kullanırız.
        Karışıklılığı önler.


        //İF KOŞULU YUKARIDAKİ KOSULLARIN SAGLANIP SAGLANMADIGINA BAKMIYOR. İF YAZDIGINIZ SÜRECE ÇALIŞIR.
        önce if koşuluna geliyor, eğer bu olmazsa bir aşagıdaki else if bloğuna gidiyor. Koşul sağlandığı blokta duruyor.

            */

        Scanner sc = new Scanner(System.in);

        System.out.print("Not Giriniz: ");
        int not = sc.nextInt();

        if (not>90) {
            System.out.println("AA");
        }else if (not>80) {
            System.out.println("BB");
        }else if (not>70) {
            System.out.println("CC");
        }else
            System.out.println("Dersten Kaldiniz");

        // TODO  If If olarak devam ederse mesela 95 aldik butun sartlari sagladigi icin tüm cevaplari girecek
        // { }  tek satir kod varsa gerek yok

    }
}
