package Mentor.BurakBy.Inheritance.Ornek1;
 // todo super class
public class Calisan {
    private String name;
    private String alan;
    private double maas;

    public Calisan(String name, String alan, double maas) {
        this.name = name;
        this.alan = alan;
        this.maas = maas;
    }

    public void bilgiler(){
        System.out.println("Calisan bilgilaeri yazdiriliyor...");
        System.out.println("Isim: " + this.name);
        System.out.println("Is Alani: " + this.alan);
        System.out.println("Maas: " + this.maas);
    }
}
