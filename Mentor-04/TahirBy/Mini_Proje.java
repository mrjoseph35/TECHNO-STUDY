package Mentor.TahirBy;

import java.util.Scanner;

public class Mini_Proje {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);



        System.out.println("Welcome to the Techno Study IT course");
        String operation="1.Course Schedule\n"
                + "2.What you will learn.\n"
                +"3.Accountant\n"
                + "4.Course Registration\n"
                + "Press q for quit";
        System.out.println(operation);
        System.out.println("*");


        while(true){
            System.out.println("Choose operation");
            String step=scan.nextLine();

            if(step.equals("q")){
                System.out.println("Exit");
                break;

            }else if(step.equals("1")){

                String morning="Official hours: Monday-Friday--> 10:00-13:00\n"
                        +"Mentoring hours:Saturday-Sunday-->10:00-13:00";
                System.out.println(morning);


            }else if(step.equals("2")){

            }else if(step.equals("3")){

            }else if(step.equals("4")){

            }else{

                System.out.println("Wrong operation");
            }

        }
        //bu proje onemli arkadasalr. ic ic  if ve donguler kullanacagiz . isterseniz birara birliktede yapabiliriz. ben simdi talimatlari yazip . duzenli sekildede atacagim
        // Techno Study sayfasina girelim.
        // kursta neler ogreniliyor
        // Ders programi gormek istiyoruz
        // kurs ucreti







    }
}
