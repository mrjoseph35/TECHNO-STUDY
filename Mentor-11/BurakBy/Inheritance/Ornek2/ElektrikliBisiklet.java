package Mentor.BurakBy.Inheritance.Ornek2;
// todo sub class
public class ElektrikliBisiklet extends Bisiklet{
    private int akuKapasitesi;
    private boolean gps;

    public ElektrikliBisiklet(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar, int akuKapasitesi, boolean gps) {
        super(renk, kacTeker, tekerlekBoyutu, ziliVar);
        this.akuKapasitesi = akuKapasitesi;
        this.gps = gps;
    }
    public void eBisikletInfo(){
        System.out.println("Bisikletin aku kapasitesi: "+this.akuKapasitesi);
        System.out.println("Bisikletin gps var mi?: "+this.gps);
    }
}
