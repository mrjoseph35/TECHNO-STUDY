package Gun51.JavaPolymorphism.Ornek2;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorev = gorev;
    }

    public static void kimlikYaz(Kisi kisi)
    {
        System.out.println("Ad="+ kisi.ad);
        System.out.println("Soyad="+ kisi.soyad);
        System.out.println("Görev="+ kisi.gorev);
    }

}
