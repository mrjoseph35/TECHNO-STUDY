package Mentor.OmerBey;

import java.util.Scanner;

public class IfElse6 {
    public static void main(String[] args) {
        //todo                   SORU 2 ---------------------------------
        /*
        Sistem şu mesajı versin :   todo  1.Stringi giriniz."
        String s1 oluşturunuz.

                                                    todo        2.String i giriniz.
         String s2 oluşturunuz.


                                                    todo        3.String'i giriniz.

      String s3 oluşturunuz.


        Girilen 3 Stringin de tek tek karakter sayıları bulunsun.

        3 stringin de karakter sayıları toplansın.

        sonuc 10'dan küçük ise   "Kısa mesaj"

        sonuç    10'dan büyük " VE "   15 ten küçük ise (10 ve 15 dahildir) "Orta Uzunlukta mesaj" ----- VE = &&

        sonuç  15'ten fazla ise         "Uzun Mesaj"


         */


        Scanner sc = new Scanner(System.in);

        System.out.print("1.Strini Giriniz : ");
        String s1=sc.nextLine();

        System.out.print("2.Strini Giriniz : ");
        String s2=sc.nextLine();

        System.out.print("3.Strini Giriniz : ");
        String s3=sc.nextLine();

        int karakterToplam = s1.length()+s2.length()+s3.length();

        if (karakterToplam<10){
            System.out.println("Kisa mesaj : " + karakterToplam);
        }else if ((karakterToplam>=10)&&(karakterToplam<=15)) {
            System.out.println("Orta Mesaj : " +karakterToplam);
        }else if (karakterToplam>15) {
            System.out.println("Orta Mesaj : " +karakterToplam);
        }

        /* son satir icin sadece else diyerek verirdi
        }else if (karakterToplam>15) {
            System.out.println("Orta Mesaj : " +karakterToplam);
        }
        */

    }
}
