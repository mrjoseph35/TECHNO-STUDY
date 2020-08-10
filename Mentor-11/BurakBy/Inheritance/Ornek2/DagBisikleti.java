package Mentor.BurakBy.Inheritance.Ornek2;
// todo sub class
public class DagBisikleti extends Bisiklet{
    private int vitesSayisi;
    private boolean ararziTekeri;

    public DagBisikleti(String renk, int kacTeker, double tekerlekBoyutu, boolean ziliVar, int vitesSayisi, boolean ararziTekeri) {
        super(renk, kacTeker, tekerlekBoyutu, ziliVar);
        this.vitesSayisi = vitesSayisi;
        this.ararziTekeri = ararziTekeri;
    }
    public void dagBisikletiInfo(){
        System.out.println("Bisikletin vites sayisi: "+this.vitesSayisi);
        System.out.println("Bisikletin arazi tekeri var mi?: "+this.ararziTekeri);
    }
}
