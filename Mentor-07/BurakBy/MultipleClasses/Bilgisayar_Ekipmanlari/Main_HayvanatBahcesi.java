package Mentor.BurakBy.MultipleClasses.Bilgisayar_Ekipmanlari;

public class Main_HayvanatBahcesi {
    /*
    //todo       Karnıyarık örneği gibi kendiniz bir konu bulup onu Classlar arasında çağırın. Örn: Hayvan, insan, araba, bilgisayar...
     */
    public static void main(String[] args) {

        Icerik icerik = new Icerik();

        icerik.zurafa = 10;
        icerik.fil = 5;
        icerik.yavruFilVarMi = true;
        icerik.kaplan = 3;
        icerik.fok = 4;
        icerik.panda = 7;
        icerik.kafesSayisi = 20;
        icerik.yemMiktari = 100.50;
        icerik.personel = 100;
        icerik.ortZiyaretciSayisi = 1000;

        System.out.println("\n***** Hayvanat Bahcesi Bilgileri *****");

        System.out.println("Personel Sayisi : " + icerik.personel);
        System.out.println("Ortalama Ziyaretci Sayisi : " + icerik.ortZiyaretciSayisi);
        System.out.println("Zurafa Sayisi : " + icerik.zurafa);
        System.out.println("Fil Sayisi : " + icerik.fil);
        System.out.println("Yavru fil var mi? : " + icerik.yavruFilVarMi);
        System.out.println("Kaplan Sayisi : " + icerik.kaplan);
        System.out.println("Fok Sayisi : " + icerik.fok);
        System.out.println("Panda Sayisi : " + icerik.panda);
        System.out.println("Kafes Sayisi : " + icerik.kafesSayisi);
        System.out.println("Yem Miktari : " + icerik.yemMiktari);


    }

}
