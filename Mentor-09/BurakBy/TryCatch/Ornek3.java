package Mentor.BurakBy.TryCatch;

public class Ornek3 {
    public static void main(String[] args) {

        System.out.println("Kodumuz baslatiliyor...");

        int sayi = 0;
        int arr[] = new int[3];
        try {
            sayi =2;   // sayi = 2/0  olursa alt satiri okumayacagi icin zero hatasi verecek
            arr[4] = 10;
        }catch (ArithmeticException bolmeHata){
            System.out.println(bolmeHata.getMessage());
        }catch (ArrayIndexOutOfBoundsException arrayHata){
            System.out.println(arrayHata.getMessage());
        }


        System.out.println("Kodumuz bitiriliyor");
    }
    /* todo bu sekli ile 2 hatayi da ayri ayri alirsak iki hatayida yazdirir
    try {
            sayi = 2 / 0;

        }
        catch (ArithmeticException bolmeHata){
            System.out.println(bolmeHata.getMessage());

        }
        try {
            arr[4] = 10;
        }
        catch (ArrayIndexOutOfBoundsException arrayHatasi){
            System.out.println(arrayHatasi.getMessage());

        }
     */
}
