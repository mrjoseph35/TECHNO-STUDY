package Gun51.JavaPolymorphism.Ornek2;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Özal", "Soyad", "öğrenci", "4a");
        Calisan cal1=new Calisan("Faruk", "Soyad", "öğretmen", "eğitim");

        Kisi.kimlikYaz(ogr1);
        Kisi.kimlikYaz(cal1);
    }
}
