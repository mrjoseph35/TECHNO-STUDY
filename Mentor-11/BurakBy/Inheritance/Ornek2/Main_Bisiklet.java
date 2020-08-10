package Mentor.BurakBy.Inheritance.Ornek2;

public class Main_Bisiklet {
    public static void main(String[] args) {
        Bisiklet B = new Bisiklet("Beyaz",2,24,true);
        B.bisikletInfo();

        System.out.println("---------------------------------");

        DagBisikleti dB = new DagBisikleti("Bordo",2,28,false,24,true);
        dB.bisikletInfo();
        dB.dagBisikletiInfo();

        System.out.println("---------------------------------");

        ElektrikliBisiklet eB = new ElektrikliBisiklet("Siyah",3,26,true,750,true);
        eB.bisikletInfo();
        eB.eBisikletInfo();

    }
}
