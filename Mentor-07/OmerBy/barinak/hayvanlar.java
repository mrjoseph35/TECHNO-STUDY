package Mentor.OmerBy.barinak;

import java.util.Scanner;

public class hayvanlar {
    String hayvan;
    int yasi;
    String renk;

    void tercihler(){
        Scanner sc = new Scanner(System.in);
        String hayvan="";
        do {
            System.out.println("Barınakta bulunan hayvanlar: ");
            System.out.println("Kedi " + "\nKöpek");
            System.out.println("Hangi hayvanı sahiplenmek istiyorsunuz?: ");
            hayvan =sc.nextLine();

        if (hayvan.equalsIgnoreCase("kedi")){
            yasi = 4;
            renk = "beyaz";
            System.out.println("Hangi hayvan : " + hayvan.toLowerCase() +"\nyas: "+yasi +"\nRenk: "+ renk);
            break;

        }else if (hayvan.equalsIgnoreCase("köpek")){
            yasi = 3;
            renk = "siyah";
            System.out.println("Hangi hayvan : " + hayvan.toLowerCase() +"\nyas: "+yasi +"\nRenk: "+ renk);
            break;

        }else
            System.out.println("Barinagimizda boyle bir hayvan bulunmamaktadir!!!" );

    }while (!hayvan.equalsIgnoreCase("kedi")|| (!hayvan.equalsIgnoreCase("köpek")));

    }
    /*
    for (int i =0; i<5;){   todo for da sonsuz dongu.... dogru sonuc olana kadar devam ediyor
            System.out.print("Hangi hayvanı sahiplenmek istiyorsunuz?");
            hayvan = sc.nextLine(); //kEdi

            if (hayvan.equalsIgnoreCase("kedi")) {

                yasi = 4;
                renk = "beyaz";
                System.out.println("Hangi hayvan:  " + hayvan.toLowerCase() + "\n yaş :  " + yasi + "\n Rengi " + renk);
                break;
            } else if (hayvan.equalsIgnoreCase("köpek")) {

                yasi = 3;
                renk = "siyah";

                System.out.println("Hangi hayvan:  " + hayvan.toLowerCase() + "\n yaş :  " + yasi + "\n Rengi " + renk);
                break;

            } else {
                System.out.println("Barınağımızda böyle bir hayvan yoktur..");
            }
        }
     */
}
