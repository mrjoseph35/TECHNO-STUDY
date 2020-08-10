package Mentor.OmerBey;

import java.util.Scanner;

public class Switch_Seyahat_Proje {
    public static void main(String[] args) {
        /*
        TOdo Switch Case ile yapalım
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası =  (100/20)* 5 =25 euro
        3.Cüzdanınızda 100 euro olsun

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.



        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
        BREAK unutma

      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.

        Break

       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.

         */

        Scanner sc = new Scanner(System.in);

        double cuzdan = 100;
        double tplmTtr = 0;
        double frnkKmIslm = (60/20)*5;
        double klnKmIslm = (80/20)*5;
        double kmBrmFyt = 5;
        double islem = 0;
        int kisiSys;

        System.out.println("\n*****Seyahat Islemleri*****");
        System.out.println("\nNereye yolculuk yapmak istiyorsunuz ? (20 KM başına 5 euro bilet parası alınmaktadir..) \nFrankfurt : 60 KM  \nKöln : 80 KM  ");
        String  stadt = sc.nextLine();
        stadt = stadt.toUpperCase();

        switch (stadt) {
            case "FRANKFURT":
                System.out.println("Rota : " + stadt);

                System.out.println(stadt + " " + frnkKmIslm + " Euro");

                break;
            case "KÖLN":
                System.out.println("Rota : " + stadt);

                System.out.println(stadt + " " + klnKmIslm + " Euro");

                break;
        }

        System.out.print("\nKac kisilik bilet istiyorsunuz? (Max 2 kisilik olabilir) : ");
        kisiSys = sc.nextInt();

        switch (kisiSys){

            case 1 :
                System.out.println("1 kisilik ");

                break;
            case 2 :
                System.out.println("2 kisilik ");

                break;
        }

        if ((stadt.equalsIgnoreCase("Frankfurt"))){
            System.out.println("\nIstikamet : " +stadt + " - " + kisiSys);
            tplmTtr = frnkKmIslm * kisiSys;

        }else if ((stadt.equalsIgnoreCase("Köln"))){
            System.out.println("\nIstikamet : " +stadt + " - " + kisiSys);
            tplmTtr=klnKmIslm*kisiSys;
        }

        System.out.println("\n\nBakiye = " + cuzdan);
        System.out.println("Toplam Tutar = " + tplmTtr);
        double paraUstu = cuzdan - tplmTtr;
        System.out.println("Para Ustu = " + paraUstu);
    }
}
