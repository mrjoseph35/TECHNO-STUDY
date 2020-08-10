package Gun51.JavaPolymorphism.Ornek2;

public class Ogrenci extends Kisi{
    private String sube;

    public Ogrenci(String ad, String soyad, String gorev, String sube) {
        super(ad, soyad, gorev);
        this.sube = sube;
    }

}
