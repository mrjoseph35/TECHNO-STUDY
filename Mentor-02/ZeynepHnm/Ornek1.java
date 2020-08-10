package Mentor.ZeynepHnm;

public class Ornek1 {
    public static void main(String[] args) {
        //TODO ORNEK1

        //1.kisim metindeki r karakterini ^ karakteri ile degistiriniz

        //2.kisim ilk kisma ek olarak  l ve p karakterlini de degistiriniz. hepsini tek bir replace ya da replaceAll kullanarak yapabilirsiniz

        //ornegin;

        //String cumle = "Buralardan gelip gecen pek coktur.";

        //System.out.println(cumle.replace('r','^').replace('l','!').replace('n', 'W'));

        String cumle = "Buralardan gelip gecen pek coktur.";

        System.out.println("Orjinal cumle = " + cumle);
        System.out.println("r ler ^ ve l ler p karakterine dönüstürüldü = " + cumle.replaceAll("r","^").replaceAll("l","p"));




    }
}
