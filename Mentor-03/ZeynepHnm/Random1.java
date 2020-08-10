package Mentor.ZeynepHnm;

public class Random1 {
    public static void main(String[] args) {
        // Random

        Math.random();  // 0.0 ve 1.0 arasinda bir deger veriyor.
        double random = Math.random();

        // eger tam sayi olarak bir deger istiyorsak *10 gibi bir sayi ile carpabiliriz
        // eger ki bir deger araliginda olacak sekilde random rakam isteniyorsa
        // o zaman bize verilen formulu kullanabiliriz.
        // (int) (Math.random() * ((max-min)+1) + min;

        // todo Ornek

        int min = 0;
        int max = 15;

        int randomNumber = (int) (Math.random() * ((max-min)+1)) + min;
        System.out.println(randomNumber);




    }
}
