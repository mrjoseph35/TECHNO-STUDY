package Mentor.ZeynepHnm;

public class Ornek1 {
    public static void main(String[] args) {
        /*
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" yazisini yazdirin,
     aksi takdirde "Tekrar deneyiniz" yazisi yazmali

     */

        int min = 1;
        int max = 6;

        int uSayi1 = (int) (Math.random() * ((max-min)+1)) + min;
        int uSayi2 = (int) (Math.random() * ((max-min)+1)) + min;
        int t = uSayi1+uSayi2;

        System.out.println(uSayi1+ " + "+uSayi2 + " = " + t);

        if (t==9){
            System.out.println("Kazandiniz");
        }else
            System.out.println("Tekrar deneyiniz");

    }
}
