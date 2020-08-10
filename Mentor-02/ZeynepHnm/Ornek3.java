package Mentor.ZeynepHnm;

public class Ornek3 {
    public static void main(String[] args) {
        //TODO ORNEK3

        //1.kisim>>> icerisinde renk gecen bir metin yaziniz ve bu rengin metin icinde olup olmadigini kontrol edin.

        //2.kisim>>> rengin oldugu kismi baska bir renk ile degistiriniz


        String cicek = "Bahcemizde rengarenk Güller ve Papatyalar var";

        boolean varMi = cicek.contains("rengarenk");  // 1.Kisim

        int renkIndex = cicek.indexOf(" ");

        String yeniStr = cicek.replaceAll("rengarenk","kirmizi");  //2.Kisim


        System.out.println("Orjinal Metin : " + cicek);
        System.out.println("\n"+"Rengarenk --> Kirmizi iledegisti : " + yeniStr);

    }
}
