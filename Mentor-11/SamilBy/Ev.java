package Mentor.SamilBy;

public class Ev {
    public static void main(String[] args) {
        BuyukDede buyukDede = new BuyukDede();  // todo ctl+alt+v  = sonrasini yazinca oncesini olusturmak icin kisa yol
        buyukDede.name = "Haci Ahmet";
        buyukDede.surname = "Hasanoglu";
        buyukDede.age = 100;
        buyukDede.jop = "Ciftci";
        buyukDede.tatlisever = true;

        System.out.println(buyukDede);

        Dede dede = new Dede();
        dede.name = "Mustafa";
        dede.boy = 170;
        dede.torun = 15;
        dede.baston = false;

        System.out.println("-------------------------------");
        System.out.println(dede);


    }
}
