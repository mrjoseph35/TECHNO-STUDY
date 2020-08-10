package Mentor.OmerBey;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        //TODO Kosullari gerceklestirmek icin olusturdugumuz kod dizisidir
        // Else : Istedigimiz kosul disinda "tüm ihtimaller" else nin icerisinde blogu calisir

        Scanner input = new Scanner(System.in);

        System.out.println("Yasinizi giriniz: ");
        int yas = input.nextInt();

        if (yas>=18){
            System.out.println("Sigara alabilirsiniz");
        }else
            System.out.println("Yasiniz sigara satin almaya uygun degil");

    }
}
