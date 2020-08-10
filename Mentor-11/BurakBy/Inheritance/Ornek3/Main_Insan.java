package Mentor.BurakBy.Inheritance.Ornek3;

public class Main_Insan {
    public static void main(String[] args) {

        Insan arif = new Insan();
        arif.boy = 175;
        arif.kilo = 60;
        arif.buyume();
        arif.spor();
        arif.yemek();

        System.out.println("Arifin boyu: " + arif.boy);
        System.out.println("Arifin kilo: " + arif.kilo);

        Cocuk can = new Cocuk();
        can.boy = 50;
        can.kilo = 10;
        can.buyume();
        can.spor();
        can.yemek();

        System.out.println("Can in boyu: "+ can.boy);
        System.out.println("Can in kilo: "+ can.kilo);


    }
}
