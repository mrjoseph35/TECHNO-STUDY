package Mentor.BurakBy.TryCatch;

public class Ornek5 {
    public static void main(String[] args) {

        System.out.println("Baslatiliyor....");

        int a = 0;
        try {
            a =2/0;
        }catch (Exception ex){

            ex.printStackTrace();
        }
        System.out.println("Bitiriliyor...");

    }
}
