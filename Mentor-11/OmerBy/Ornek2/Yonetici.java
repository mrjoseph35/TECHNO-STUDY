package Mentor.OmerBy.Ornek2;

import Mentor.OmerBy.Ornek2.Calisan;

public class Yonetici extends Calisan {
    private int sorumluOlduguKisiSayisi;

    public Yonetici(String name, String departman, int maas, int sorumluOlduguKisiSayisi) {
        super(name, departman, maas);
        this.sorumluOlduguKisiSayisi = sorumluOlduguKisiSayisi;
    }

    @Override
    public void Bilgilerim() {
        super.Bilgilerim();
        System.out.println("Sorumlu oldugu kisi sayisi: " + this.sorumluOlduguKisiSayisi);
    }
}
