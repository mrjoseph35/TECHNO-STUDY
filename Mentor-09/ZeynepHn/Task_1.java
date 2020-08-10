package Mentor.ZeynepHn;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task_1 {
    /*
    ayEkle adli bir metod olusturunuz
        return type bir String
        parametrsi de int(myMonth)

        bugunun tarihini ve
        ardindan uzerine ay eklenmis halini return yapiniz



     mesela:

        bugunun tarihi 07/24/2020
        myMonth = 4

        return  11/24/2020
     */

    public static void main(String[] args) {

        ayEkle(4);



    }

    public static String ayEkle(int myMonth) {
        LocalDate today = LocalDate.now();
        System.out.println("ay eklemeden once : " + today);

        LocalDate actual = today.plusMonths(myMonth);
        System.out.println("ay ekledikten sonra : " + actual);

        DateTimeFormatter formatliTarih = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        String format = actual.format(formatliTarih);
        System.out.println("ay ekledikten sonra formatli : " + format);


        return actual.toString();
    }

}
