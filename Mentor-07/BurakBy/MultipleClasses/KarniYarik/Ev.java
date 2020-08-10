package Mentor.BurakBy.MultipleClasses.KarniYarik;

import Class_Calisma.classOrnek.Main;

public class Ev {
    public static void main(String[] args) {

       Market yemek= new Market();
     //  yemek.patlican2= 6;   // patlican2  private oldugu icin kendi class disinda calismiyor
        yemek.patlican = 6;
        yemek.domates = 0.5;
        yemek.biber = 0.5;
        yemek.biberAciMi = false;
        yemek.sogan = 0.5;
        yemek.zeytinyagi = 1;
        yemek.kiyma = 0.5;
        yemek.sarmisak = 4;
        yemek.dSalcasi = 0.5;
        yemek.bSalcasi = 0.5;
        yemek.tuzKarabiber = 1;

        System.out.println("Karniyarik yapmak ocon malzemeler : ");
        System.out.println(yemek.patlican);
        System.out.println(yemek.domates);
        System.out.println(yemek.biber);
        System.out.println(yemek.biberAciMi);
        System.out.println(yemek.sogan);
        System.out.println(yemek.zeytinyagi);
        System.out.println(yemek.kiyma);
        System.out.println(yemek.sarmisak);
        System.out.println(yemek.dSalcasi);
        System.out.println(yemek.bSalcasi);
        System.out.println(yemek.tuzKarabiber);




    }
}
