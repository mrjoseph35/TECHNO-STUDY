package Mentor.OmerBy.Ornek2;

public class Main_Class {
    public static void main(String[] args) {
        Calisan sekreter = new Calisan("Hakan","Bilisim",2000);
        sekreter.zam();
        sekreter.Bilgilerim();

        System.out.println("---------------------------");

        Calisan satisDanismani = new Calisan("Hatice","Pazarlama",1700);
        satisDanismani.Bilgilerim();

        System.out.println("---------------------------");

        Yonetici mudur = new Yonetici("Omer","Yonetim", 3500, 100);
        mudur.zam();
        mudur.Bilgilerim();



    }
}
