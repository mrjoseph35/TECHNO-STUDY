package Mentor.TahirBy.junit;

public class Main {
     /*
 - Kodlarin kucuk parcalarini test eder(Method v fonksiyonlar,siniflar)
 - Kodu anlasilmasini kolaylastirir
 - hata orani azalir, kod kalitesi artar
 - daha guvenli kodlar
 - Junit kutuphanesi

     */


    public static void main(String[] args) {

    }
    // Stringin son karakterini veren  method yaziyoruz
    public char lastCharacter(String str) {

        return str.charAt(str.length() - 1);

    }
    // Arrayin max elemanini bulma methodu yazalim ve test edelim
    public int maxNumberArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    // faktoriyel bulma methodunu  yazalim ve test edelim
    public int faktoriyelBul(int sayi){
        int sonuc=1;
        for (int i = sayi; sayi>=1; i--) {

            sonuc*=i;
            sayi--;

        }
        return sonuc;
    }
    /*  Faktoriyel 2.Yöntem
    public  int factorial(int num) {



        int faktoriyel=1;

        while(num>0){
            faktoriyel=faktoriyel*num;
            num--;
        }
        return faktoriyel;
    }
     */
}