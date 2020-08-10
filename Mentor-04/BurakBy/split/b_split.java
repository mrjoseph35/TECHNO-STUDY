package Mentor.BurakBy.split;

public class b_split {
    public static void main(String[] args) {
        // todo Bir Scanner olusturup bir tarih giriinz
        // Orn: (19/08/2020) bu tarihteki / isaretini split metodu uygulayiniz

        String str = new String("09/12/1996");

        System.out.println("Dogum Gunum : ");
        String [] array = str.split("/");

        for (String date : array){

            System.out.println(date);
        }

    }
}
