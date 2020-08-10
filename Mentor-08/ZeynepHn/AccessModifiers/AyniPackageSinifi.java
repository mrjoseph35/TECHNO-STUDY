package Mentor.ZeynepHn.AccessModifiers;

public class AyniPackageSinifi {

    public static void main(String[] args) {
        NeNedir erisim =  new NeNedir();
        erisim.yas = 5;
        erisim.numara = 4.0;
        erisim.isim = "Ayse";


        erisim.yiliYazdir();


        System.out.println(erisim.eyaletVergisi("$100,00"));
    }

}
