package Mentor.ZeynepHn.tasks.Task1;
/*
konu ve ogrenci/ogretmen siniflarini da cagiracak sekilde instance variable lar olusturunuz.
ogrencinin olusturdugu raporu verecek bir toString methodu olusturunuz.
soyle gozukmeli:

Dersin konusu: Java
Isim: Hasan
Yas: 26
Bolum: Bilgisayar
Not ortalamasi: 67

Ogretmenin adi: Ali
Mezun oldugu bolumu: Isletme
Ogretmenin kalitesi: Olaganustu kaliteli bir ogretmen

 */
public class Sinif {

    String konu;
    Student student;
    Ogretmen ogretmen;


    public String toString(){

        return "Dersin konusu : " +konu+
                "\n Ogrenci ismi : " + student.name +
                "\n bolumu : " +student.bolum +
                "\n yasi : " + student.yas +
                "\n birinci Sinav : " + student.birinciSinav+
                "\n ikinci Sinav : " + student.ikinciSinav+
                "\n ucuncu Sinav : " + student.ucuncuSinav+
                "\n Not Ortalamsi : " +student.notOrtalam()+
                "\n\n Ogretmenin ismi : " + ogretmen.name+
                "\n Bolumu : " + ogretmen.bolum+
                "\n Deneyim : " + ogretmen.deneyim+
                "\n Ogretmenin Deneyim Durumu : " + ogretmen.ogretmenimNasil();
    }

}
