package Mentor.OmerBey;

import java.util.Scanner;

public class Nested_If_Else2 {
    public static void main(String[] args) {
        /*
            hava durumu ile ilgili sistem size "derece giriniz" sorusunu sorsun.

        int derece oluşturarak bir değer giriniz.

        havanın güneşli olup olmadıgını belirlemek için de         boolean sunny               oluşturunuz.

        eğer derece 40 tan fazla ise    "dışarısı çok sıcak!" yazsın ve eğer güneşli ise  (boolean=true ise)  ,   " ayn ı zamanda güneşli ! " yazsın.

        güneşli değil ise (boolean=false ise)       ,      "ve bulutlu "  yazsın.


        40 dereceden düşük ise dışarısı sıcak değil yazsın.

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Derece Giriniz : ");
        int derece = sc.nextInt();


        if (derece>40){

            System.out.print("Hava Gunesli mi? (true-false) : ");
            boolean sunny = sc.nextBoolean();


            System.out.println("Disarisi Cok Sicak");

            if(sunny==true)
                System.out.println("Ayni Zamanda Gunesli");

            else  System.out.println("ve Bulutlu");

        }else
            System.out.println("Disarisi Sicak Degil");


    }
}
