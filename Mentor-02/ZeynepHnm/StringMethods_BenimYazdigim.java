package Mentor.ZeynepHnm;

import java.util.Arrays;

public class StringMethods_BenimYazdigim {
    public static void main(String[] args) {

        /** indexOf()
         * *
         */

        String cicek = "Gunebakan";

        System.out.println(" e harfi metinde kacinci indexte = " + cicek.indexOf("e"));
        System.out.println("--------");

        /**
         * lastIndexOf()
         */
        System.out.println(" sondaki n harfi metinde kacinci indexte = " + cicek.lastIndexOf("n"));
        System.out.println("--------");

        /**
         * charAt()
         */

        String sehir = "Istanbul";

        System.out.println("Metinin 5.index harfi : "+sehir.charAt(5));
        System.out.println("--------");

        /**
         * substring()  index araligini yazdirir.
         * ...dan itibaren yazdirir
         */

        String isim = "yurdagul";
        System.out.println("2.indexten sonrasi = " + isim.substring(2));
        System.out.println("3. ve 5,index arasi = " + isim.substring(3,5));

        String bilgi = "isim: ayse";
        int bosluk =bilgi.indexOf(" ");

        System.out.println("bosluk indexi = " + bosluk);
        System.out.println(bilgi.substring(bosluk+1));
        System.out.println("--------");

        /**
         * trim()  traslamak kirpmak
         */

        String ulke = "        Almanya       ";
        System.out.println("trim kullanmadan once >>>>" + ulke+"<<<<<");
        System.out.println("trim kullaninca >>>>" + ulke.trim());
        System.out.println("--------");


        /**
         * replace()  hedef aldiginiz kumeyi degistiriyorsunuz
         */

        String ozellik = "hayalperest";
        System.out.println("a harflerini @ isareti ile degistir = " + ozellik.replace('a','@'));

        String kuruyemis = "yer fistigi ";

        System.out.println("dizi kumesini degistir = " + kuruyemis.replace("yer","sam"));
        System.out.println("--------");

        /**
         * replaceAll()
         */

        String numara = "$1800 Milyon";

        System.out.println("Replace harfleri sildirdik numara = " + numara.replaceAll("[a-zA-Z]",""));
        System.out.println("Replace rakamlari sildirdik numara = " + numara.replaceAll("[0-9]",""));


        /**
         * equals()   equalsIgnoreCase()
         */

        String  ad = "Bahadir";

        System.out.println("Birebir ayni yazildi mi = " + ad.equals("Bahadir"));
        System.out.println("kucuk buyuk farketmeden ayni yazildi mi = " + ad.equalsIgnoreCase("bahadir"));


        String sahipMi = "Baha";

        System.out.println("sahipMi = " + ad.contains(sahipMi));
        System.out.println("--------");


        /**
         * startsWith ()
         * endsWith ()
         */



    }
}
