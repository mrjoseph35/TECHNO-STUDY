package Mentor.OmerBy;

public class islem {
    /*
        randomSayi isminde static void bir method oluşturun.

        Bu method içerisinde iki int random sayı oluştusun. (0'dan 10 a kadar)

        Bu iki random sayının toplamını yazdırın.
        Eğer bu iki random sayı toplami 12 den küçükse "Exception" versin ve mesaj olarak ("Sayı 12'den küçük ise hata verir") yazsın.

        Methodu main methodunda çağırın ve kodun düzgün çalışmasını sağlayın. (Aksaklığı giderin)
         */
    public static void main(String[] args) {
        try {
            random();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Selam");

    }

    static void random() throws Exception {   // todo Exception  imzasi  = throws Exeption
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;

        System.out.println("Toplam : " + (a + b));

        if ((a + b) < 12)
            throw new Exception("Sayilarin toplami 12 den kucuk");   // todo Execption hatasi yazinca methoda imzasini eklemek gerekiyor


    }
    // Eger throw new ArithmeticException   kullansaydik  imzaya gerek kalmayacakti ve try-catch zorunlulugu olmayacakti
    // Fakat sartima denk geldiginde hata verip prg durduracakti
}
