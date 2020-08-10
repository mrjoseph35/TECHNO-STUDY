package Mentor.BurakBy.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kodumuz baslatiliyor...");

        int sayi = 0;
        int arr[] = new int[3];

        try {
            //   sayi =2;
            //  arr[4] = 10;
           // sc.nextInt();
        }catch (ArithmeticException bolmeHata){
            System.out.println(bolmeHata.getMessage());
        }catch (ArrayIndexOutOfBoundsException arrayHata){
            System.out.println(arrayHata.getMessage());
        }catch (InputMismatchException scannerHata){
            //  System.out.println(scannerHata.getMessage());     // bu null veriyor cunku hatadan sonra mesaj yok
            System.out.println(scannerHata.toString());
        }finally {
            System.out.println("Finally her durumda calisiyor");
        }


        System.out.println("Kodumuz bitiriliyor");
    }
}
