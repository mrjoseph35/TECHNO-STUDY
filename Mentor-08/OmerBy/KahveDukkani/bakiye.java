package Mentor.OmerBy.KahveDukkani;

public enum  bakiye {
    Musteri1(10);

   private final double bakiye;

    bakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    double getBakiye(){
        return bakiye;
    }
}
