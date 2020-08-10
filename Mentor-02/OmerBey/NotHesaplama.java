package Mentor.OmerBey;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {

        /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

                                        todo    Koşul kısmı

                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.



         */

        Scanner sc = new Scanner(System.in);

        System.out.println("    *****Not Ortalama Portalina Hosgeldiniz*****    ");

        System.out.print("\n"+"Vize sınav sonucunuzu giriniz : ");
        double vizeNotu = sc.nextDouble();

        System.out.print("\n"+"Vize sınavı yüzdesini giriniz (örn:65,5 ): ");
        double vizeNotuYuzde= sc.nextDouble();

        System.out.print("\n"+"Final sınav sonucunuzu giriniz : ");
        double finalNotu = sc.nextDouble();

        System.out.print("\n"+"Final sınavı yüzdesini giriniz (örn:65,5 ): ");
        double finalNotuYuzde= sc.nextDouble();

        double  ort = (vizeNotu*vizeNotuYuzde) + (finalNotu*finalNotuYuzde);

        if (ort>=90){
            System.out.println("Notunuz : AA");  // 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
        }else if ((ort>=80)&& (ort<90)){
            System.out.println("Notunuz : BA");  // 80(80dahil)   ile 90 arasında ise  BA,
        }else if ((ort>=70)&& (ort<80)){
            System.out.println("Notunuz : BB");  //70(70 dahil)   ile 80 arasında ise BB,
        }else if ((ort>=60)&& (ort<70)){
            System.out.println("Notunuz : CB");  //60(60dahil) ile 70 arasında ise CB,
        }else if ((ort>=50)&& (ort<60)){
            System.out.println("Notunuz : CC");  // 50(50 dahil) ile 60 arasında ise CC,
        }else if ((ort>=40)&& (ort<50)){
            System.out.println("Notunuz : DC");  // 40(40 dahil) ile 50 arasında ise DC,
        }else if ((ort>=30)&& (ort<40)){
            System.out.println("Notunuz : DD");  //  30(30 dahil) ile 40 arasında ise DD,
        }else if (ort<30){
            System.out.println("Notunuz : FF");  // 30 'dan düşük ise FF
        }


    }
}
