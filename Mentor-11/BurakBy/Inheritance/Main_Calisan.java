package Mentor.BurakBy.Inheritance;

import Mentor.BurakBy.Inheritance.Ornek1.Isci;
import Mentor.BurakBy.Inheritance.Ornek1.Muhendis;

import java.lang.management.MemoryUsage;

public class Main_Calisan {
    public static void main(String[] args) {
        Isci Mehmet = new Isci("Mehmet","Metal Iscisi",2800);

        Muhendis Caner = new Muhendis("Caner","Makine Muhendisi",4000);

        Mehmet.bilgiler();
        System.out.println("------------------------------");
        Caner.bilgiler();


    }
}
