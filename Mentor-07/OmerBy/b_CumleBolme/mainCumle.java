package Mentor.OmerBy.b_CumleBolme;

public class mainCumle {
     /*
    Girdiğimiz bir cümleyi tam ortasından ikiye ayıran bir program yazalım.

    textClass isminde bir yan class oluşturalım.
    String text1 ve String text2 yi tanımlayıp istenilen cümleleri karşısına yazalım.
    textClass 'ın içerisine public String ilkYarisi methodunu oluşturalım ve parametresi String text olmalı.
    Burada yazılan text'in ilk yarısını return etsin.

    textClass'ın içerisine public String ikinciYarisi diye bir method oluşturun ve parametresi String text olsun.
    Burada yazılan textin 2. yarısını return etsin. (genel bir method olmalı, her cümlede çalışmalı.)


    Ana classımızda (main methodunun  oldugu class) 'topla' isminde void bir method oluşturalım. parametresi String a ve String b olsun.
    Bu method, text1'in ilk kısmını,
                           text2'nin ikinci kısmını alsın.    ipucu(Daha önceden oluşturduğumuz methodları kullanın....)

                           Text1 in ilk kısmını ve text2 nin ikinci kısmını birleştirsin. (Yeni bir cümle yapsın, 2 yarıyı da toplasın.)

    örn: text 1= javayı seviyorum
            text2 = techno study
            konsolda "sadece" şu yazmalı:
            javayı setechno
     */
     public static void main(String[] args) {

         textClass text =new textClass();

         String text1 = text.text1;
         String text2 = text.text2;

         System.out.println("Text1 :"+text1 );
         System.out.println("Text2 :"+text2 );

         getTopla(text1,text2);


//         System.out.println(text.getTextBirlestir(text.text1,text.text2));
//
//         System.out.println(text.getIlkYarisi(text));

     }
     public static void getTopla(String text1, String text2){

         textClass text =new textClass();

         String sonuc= text.getIlkYarisi(text1)+" "+text.getIkinciYarisi(text2);
         System.out.println("Yeni text :" + sonuc);

     }

}
