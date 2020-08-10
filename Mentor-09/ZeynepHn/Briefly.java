package Mentor.ZeynepHn;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Briefly {
    public static void main(String[] args) {
        bugununTarihi();

        suankiSaat();
        suankiSaat2();

        saatVeTarih();
        saatVeTarih2();



    }
    public static void bugununTarihi(){
        LocalDate today = LocalDate.now();

        System.out.println("Bugunun tarihi : "+today);

        DateTimeFormatter formatliTarih = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        String  format = today.format(formatliTarih);
        System.out.println("Format edilmis hali: " +format);

    }
    public static void suankiSaat(){
        LocalTime suankiSaat = LocalTime.now();

        System.out.println("Formattan Oncesi: " + suankiSaat);

        DateTimeFormatter formatliSaat = DateTimeFormatter.ofPattern("hh:ss a");
        String format = suankiSaat.format(formatliSaat);
        System.out.println("Formatli saat : " +format);

    }
    public static void suankiSaat2(){
        LocalTime zaman = LocalTime.of(10,0,30);
        System.out.println("Format oncesi : "+zaman);
        DateTimeFormatter formatliZaman = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        String format = zaman.format(formatliZaman);
        System.out.println("Formatli saat : "+format);

    }
    public static void saatVeTarih(){
        LocalDateTime dateTime = LocalDateTime.of(2020,3,20,14,20,25);

        System.out.println("Formaz oncesi : " +dateTime );

        DateTimeFormatter formatDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String format = dateTime.format(formatDateTime);

        System.out.println("Formatli tarih-zaman : " +format);

    }
    public static void saatVeTarih2(){
        LocalDate date = LocalDate.of(2020,3,20);
        LocalTime time = LocalTime.of(14,20,25);

        LocalDateTime dateTime = LocalDateTime.of(date,time);
        System.out.println("Format oncesi : " +dateTime );

        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("HH:ss MM dd yyy");
        String format = dateTime.format(formatDateTime);

        System.out.println("Formatli tarih-zaman : " +format);

    }
}
