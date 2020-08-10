package Mentor.ZeynepHnm;

public class Ornek3 {
    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cif sayi ise sift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz

        int min = 0;
        int max = 100;

        int uSayi = (int) (Math.random() * ((max-min)+1)) + min;

        System.out.println("Random Sayi = " + uSayi);

        if (uSayi%2==0)
            System.out.println("Uretilen Sayi Cift Sayidir" );
         else
             System.out.println("Uretilen Sayi Tek Sayidir" );

         // 2.Yöntem  : Ternary operator ile

        String str = (uSayi%2==0) ? "Cift Sayi" : "Tek Sayidir";  /// cift sayi String ifade oldugu icin Strng e esitledik
                                                                  // Integer olsaydi  23 - 14  gibi o zamanda Integer esitlemis olcaktik
        System.out.println(str);

    }
}
