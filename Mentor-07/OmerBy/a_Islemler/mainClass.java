package Mentor.OmerBy.a_Islemler;

public class mainClass {
    /*
    /*

     todo       -----------       İki random sayı ile 4 işlem                   -----------

islemler isminde bir class oluşturun.

bu classta 4 işlem için 4 ayrı method oluşturun.örn: public int topla(int a, int b)- çıkarma - çarpma - bölme

return olarak o işlemi versin. örn: return a-b;

main classımızda iki int oluşturun ve bu iki int 0'dan 15 e kadar random sayılar alsın.

Bu iki int i    4işlem methodlarında kullanın.

konsol şöyle olmalı:            (Sayılar her run yapıldığında değişmeli, random atanmalı)
Sayı 1 =  9
Sayı 2 =  4
------------İşlemler ----------
Toplama:  13
Çıkarma:   5
Çarpma:    36
Bölme:       2.25

 */
    public static void main(String[] args) {
        islemClass dortislem = new islemClass();


        int a=(int) (Math.random()*15+1);
        int b=(int) (Math.random()*15+1);

        System.out.println("*****ISLEMLER*****");

        System.out.println("Random Sayi 1: " + a);
        System.out.println("Random Sayi 2: " + b+"\n");

        System.out.println("Toplama  : " +dortislem.getTopla(a,b));
        System.out.println("Cikartma : " +dortislem.getCikar(a,b));
        System.out.println("Carpma   : " +dortislem.getCarp(a,b));
        System.out.println("Bolme    : " +dortislem.getBol(a,b));

    }
}
