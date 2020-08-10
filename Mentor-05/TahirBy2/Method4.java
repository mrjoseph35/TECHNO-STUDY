package Mentor.TahirBy2;

import java.util.Scanner;

public class Method4 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your gread: ");
        int gread=sc.nextInt();

        String mesaj=grades(gread);
        System.out.println(mesaj);

    }

    public static String    grades(int grade){

        String mesaj= "";

        if(grade>=85) {
            mesaj="Perfect";
        }else if(grade>=70) {
            mesaj="Good";
        }else if(grade>=60) {
            mesaj="Normal";
        }else if(grade>=45) {
            mesaj="Not bad";
        }else
           mesaj="Bad";

            return mesaj;
    }
}
