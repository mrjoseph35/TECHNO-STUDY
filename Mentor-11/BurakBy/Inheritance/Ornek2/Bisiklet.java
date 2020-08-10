package Mentor.BurakBy.Inheritance.Ornek2;
// todo superclass
public class Bisiklet {

    private String renk;
    private int kacTeker;
    private double tekerlekBoyutu;
    private boolean ziliVar;

    public Bisiklet(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar) {
        this.renk = renk;
        this.kacTeker = kacTeker;
        this.tekerlekBoyutu = tekerlekBoyutu;
        this.ziliVar = ziliVar;
    }

    public void bisikletInfo(){
        System.out.println("Bisikletin Rengi: "+ this.renk);
        System.out.println("Bisikletin kac teker: "+ this.kacTeker);
        System.out.println("Bisikletin teker boyutu: "+ this.tekerlekBoyutu);
        System.out.println("Bisikletin zili var mi? : "+ this.ziliVar);
    }
}
