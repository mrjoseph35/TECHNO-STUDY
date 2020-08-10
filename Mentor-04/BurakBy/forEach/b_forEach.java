package Mentor.BurakBy.forEach;

public class b_forEach {
    public static void main(String[] args) {
        // Todo Integer Array indeki elemanlari for each dongusu ile toplayiniz

        int[] SayiArray = {5, 8, 35, 90, 12};
        int tplm= 0;

        for (int yeniSayi : SayiArray){

            tplm+=yeniSayi;
        }
        System.out.println("Toplam= " + tplm);
    }
}
