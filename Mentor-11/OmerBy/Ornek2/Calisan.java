package Mentor.OmerBy.Ornek2;

public class Calisan {
    private String name;
    private String departman;
    private int maas;

    public Calisan(String name, String departman, int maas) {
        this.name = name;
        this.departman = departman;
        this.maas = maas;
    }
    public int zam(){
        return maas+=500;
    }
    public void Bilgilerim(){
        System.out.println("sistem Bilgileri yukleniyor...");
        System.out.println("Ad: "+this.name);
        System.out.println("Departman: "+this.departman);
        System.out.println("Maas: "+this.maas);

    }
}
