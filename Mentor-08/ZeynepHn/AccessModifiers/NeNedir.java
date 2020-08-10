package Mentor.ZeynepHn.AccessModifiers;

public class NeNedir {
    /*



     */
    public int yas;
    protected double numara;

    //encapsulation
    private int yil ;
    public void yiliYazdir(){
        System.out.println(yil);
    }

    String isim;

    /*  ornek1

     adi eyaletVergisi olan bir method olusturun
     ve bu method sadece ayni package icinde erisilebilir olsun
     return tipi double ve parametresi bir String
     tum $ ve , isaretlerini kaldirip, degeri double olarak degistiriniz (vergi orani ise double degerin 7.75 idir)

     */
    // default method olarak kullandik
    double eyaletVergisi(String str){
        str = str.replaceAll("\\$","").replaceAll(",","");
     //   str= str.replaceAll("[^0-9]","");
        return (Double.parseDouble(str))*0.0775;

    }
}
