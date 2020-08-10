package Mentor.ZeynepHn.tasks.Task1;

import java.util.Arrays;

public class AnaSinif {

        public static void main(String[] args) {

                Sinif sinif=new Sinif();
                sinif.konu="Java";
                sinif.student= new Student();
                sinif.student.name="Hasan";
                sinif.student.bolum="Bilgisayar";
                sinif.student.yas= 20;
                sinif.student.birinciSinav=69;
                sinif.student.ikinciSinav=75;
                sinif.student.ucuncuSinav=89;

                sinif.ogretmen=new Ogretmen();
                sinif.ogretmen.name="Ali";
                sinif.ogretmen.bolum="Muhendis";
                sinif.ogretmen.deneyim=5;

                System.out.println(sinif);


        }
}
