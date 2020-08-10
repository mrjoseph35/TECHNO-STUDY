package Mentor.OmerBy.KahveDukkani;

public enum  Tatlilar {
    CILEKLIPASTA(4),
    MOZAİKPASTA(3.5),
    MUZLUPASTA(4.5);

    private final double tatliFiyati;

    Tatlilar(double tatliFiyati) {
        this.tatliFiyati = tatliFiyati;
    }

    double getTatliFiyati(){
        return tatliFiyati;
    }
}
