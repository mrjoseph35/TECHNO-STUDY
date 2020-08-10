package Mentor.OmerBey;

import java.util.Scanner;

public class Nested_If_Else_MenuProje {
    public static void main(String[] args) {
        /*
        Büfeden sipariş vereceksiniz.
        Double cuzdanim  oluşturun ve içerisinde 20 euro para olsun.
        Ve double toplamTutar oluşturun, her işlem sonrası artsın. (her siparişten sonra belirtilen fiyatı toplamtutara ekleyin!!

        ilk olarak konsolda;
        1.Hamburger : 3 Euro
        2.CheeseBurger: 4 Euro
        3.Döner : 2.5 Euro

        yazsın.   Kullanıcı int değeri girerek seçeneklerden birini seçsin.

                todo Eğer 1'i seçerse,
          (toplamTutara hamburgerin fiyatını eklemeyi unutmayın!!)
        Sistem bize "Ekstra Köfte İster misiniz ? (+1 Euro fark ile) :   (büyük küçük harf duyarlı olmaması için method kullanın)

        evet derse "2. köfte ekleniyor" mesajı gelsin.Altında da "Çift köfteli hamburgeriniz hazır !" yazsın.

        Hayır derse "Hamburgeriniz hazırdır !" yazsın.

        todo Eğer 2 yi seçerse,

         Sistem bize "Ekstra peynir ister misiniz? (+ 0,50 cent fark ile)  sorusunu sorsun.

         Evet derse, "2. peynir ekleniyor" mesajı, ve altına da "Çift peynirli Cheeseburgeriniz hazır! yazsın.

         Hayır derse, "CheeseBurgeriniz hazır !"    yazsın.

         todo Eğer 3 'ü seçerse,

        Ekstra Sos ister misiniz ? (Barbekü sos ve Acı sos) :  (+ 0,50 cent fark ile)   sorusunu sorsun.
        Evet derse ,   sos lari sorarak cevap alacagiz

        Eğer Barbekü sos seçilirse "Barbekü soslu döneriniz hazır ! ",
        Eğer Acı sos seçilirse "Acı soslu döneriniz hazır !

        hayır derse,
     Döneriniz sossuz hazırlanıyor..


todo    İçecek ister misiniz ? (Mevcut içeceğimiz: Coca Cola = 1,5 Euro)

Eğer evet derse, "Normal ya da Zero ?  (normal veya zero olarak cevaplayınız ): "  sorusunu sorsun.

 Eğer normal derse, Coca Cola hazırlanıyor..
 Eğer  zero derse, Coca Cola Zero hazırlanıyor.


 Bu aşamaya kadar hep harcalamalar yaptık.
 Her harcama yaptıgımızda double toplamTutar'a bunu eklememiz gerekiyor.

 Önce cüzdanımı görmek istiyorum. (cüzdanım = 100 euro)
 Toplam tutarı yazdırın.. (45 euro )
 double paraUstu oluşturun ve paraüstünü yazdırın. (para üstü = 55 euro)



 -TODO İPUCU -  Dummy kod eklemeniz gereken yerleri tespit edin ve boş Line ekleyin. (String bosLine = sc.nextLine();)

                 */

        Scanner sc = new Scanner(System.in);

        double cuzdan = 20 ;
        double toplamTutar=0;
        String evetHayir;

        System.out.println("*****Menü*****");

        System.out.println("1.Hamburger : 3 Euro " + "\n" + "2.CheeseBurger : 4 Euro  " + "\n" + "3.Döner : 2.50 Euro");

        int menuNo = sc.nextInt();


        if (menuNo==1) {

            toplamTutar += 3;

            sc.nextLine();

            System.out.print("Ekstra kofte ister misiniz ? ( +1 Euro fark ile ) : ");
            evetHayir = sc.nextLine();


            if (evetHayir.equalsIgnoreCase("evet")) {
                toplamTutar += 1;
                System.out.println("*****2.Kofteniz Hazirlaniyor*****");
                System.out.println("Çift köfteli hamburgeriniz hazır !");

            } else if (evetHayir.equalsIgnoreCase("hayir"))
                System.out.println("Hamburgeriniz hazırdır !");

        }

            if (menuNo == 2) {

                toplamTutar += 4;

                sc.nextLine(); //dummy kod (boskod)

                System.out.print("Ekstra peynir ister misiniz ? ( +0,50 Euro fark ile ) : ");
                evetHayir = sc.nextLine();

                if (evetHayir.equalsIgnoreCase("evet")) {
                    toplamTutar += 0.5;
                    System.out.println("*****2.Peyniriniz Hazirlaniyor*****");
                    System.out.println("Çift peynirli Cheeseburgeriniz hazır!");

                } else if (evetHayir.equalsIgnoreCase("hayir"))
                    System.out.println("CheeseBurgeriniz hazır !");

            }


                if (menuNo == 3) {
                    toplamTutar += 2.5;

                    sc.nextLine();  // dummy kod (boskod)

                    System.out.print("Ekstra Sos ister misiniz ?   (+ 0,50 cent fark ile Barbekü sos ve Acı sos Mevcuttur) ");
                    evetHayir = sc.nextLine();


                    if (evetHayir.equalsIgnoreCase("evet")) {
                        toplamTutar += 0.50;

                        System.out.print("Barbekü sos ve Acı sos : ");
                        String sos = sc.nextLine();

                        if (sos.equalsIgnoreCase("Barbekü Sos")) {
                            System.out.println(sos + "lu döneriniz hazır !");
                        }else if (sos.equalsIgnoreCase("Aci Sos"))
                            System.out.println(sos + "lu döneriniz hazır !");

                    } else if (evetHayir.equalsIgnoreCase("hayir"))
                        System.out.println("Döneriniz sossuz hazırlanıyor.");

                }

        System.out.print("Icecek Ister misiniz ( evet-hayir ) : ");
        evetHayir = sc.nextLine();

        if (evetHayir.equalsIgnoreCase("evet") ){

        toplamTutar += 1.5;

            System.out.println("Mevcut içeceğimiz: Coca Cola = 1,5 Euro");
        System.out.print("Normal mi? Zero ?  (Normal veya Zero olarak cevaplayınız ):");
        String icecekCevap = sc.nextLine();

               if (icecekCevap.equalsIgnoreCase("normal")) {
                   System.out.println("Coca Cola Normal hazirlaniyor");
               } else if (icecekCevap.equalsIgnoreCase("zero")) {
                   System.out.println("Coca Cola Zero hazirlaniyor");

                        }
        }else if (evetHayir.equalsIgnoreCase("hayir"))
             System.out.println("Icecek Secilmedi");


        System.out.println("Cüzdanim : " + cuzdan);
        System.out.println("Toplam Tutar : " + toplamTutar);
        double paraustu = cuzdan-toplamTutar;
        System.out.println("Para Ustu = " + paraustu);



    }

}
