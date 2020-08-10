package Mentor.TahirBy2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your gread: ");
        int gread=sc.nextInt();

        grades(gread);

    }

    public static void   grades(int grade){

        if(grade>=85)
            System.out.println("Perfect");
       else if(grade>=70)
           System.out.println("Good");
       else if(grade>=60)
           System.out.println("Normal");
       else if(grade>=45)
           System.out.println("Not bad");
       else
           System.out.println("Bad");


    }
}
