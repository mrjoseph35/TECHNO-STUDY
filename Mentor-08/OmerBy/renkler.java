package Mentor.OmerBy;

public enum renkler {
    /*
Enum renkler oluşturun. (main class i ile aynı classta olsun.)
Trafik lambası mantığı ile hareket edin. Her rengin parametresi olarak kuralını yazın. örn: KIRMIZI("DUR")   (KIRMIZI , SARI , YEŞİL için)

main methodunun içerisinde bu değerleri parametreleri ile beraber yazdırın. (       todo ipucu:  array a atayın     -    foreach)

Konsol böyle olmalı:

Renk : KIRMIZI    kural: DUR
Renk : SARI    kural: HAZIR OL
Renk : YESİL    kural: GEÇ
 */
    KIRMIZI("DUR"),
    SARI("HAZIR OL"),
    YESIL("GEC");

    private final String kural;

    renkler(String not) {

        kural = not;
    }

    String getKural() {

        return kural;
    }

    public static void main(String[] args) {

        renkler[] tumRenkler = renkler.values();

        for (renkler r : tumRenkler) {

            System.out.println("Renk : " + r.name() + "   Kural : " + r.getKural());

        }

        System.out.println();

        for (int i = 0; i <tumRenkler.length ; i++) {

            System.out.println("Renk : " + tumRenkler[i].name() + "  Kural : " + tumRenkler[i].getKural());
        }


    }


}

