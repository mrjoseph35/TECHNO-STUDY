package Gun51.JavaPolymorphism.Ornek2;

public class Calisan extends Kisi{
    private String departman;

    public Calisan(String ad, String soyad, String gorev, String departman) {
        super(ad, soyad, gorev);
        this.departman = departman;
    }
}
