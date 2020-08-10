package Mentor.OmerBy.KahveDukkani;

public enum  icecekler {
    TURKKAHVESİ(3),
    ESPRESSO(4.5),
    GAZOZ(2.25),
    LİMONATA(2);

    private final double icecekFiyat;

    icecekler(double icecekFiyat) {
        this.icecekFiyat = icecekFiyat;
    }

    double getIcecekFiyat(){
        return icecekFiyat;
    }
}
