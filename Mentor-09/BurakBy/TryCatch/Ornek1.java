package Mentor.BurakBy.TryCatch;

public class Ornek1 {

    // todo    try-catch
    // todo    try = dene          catch = yakala   --> Basketbol topu gibi dusunelim iki arkadasta biri topu atiyor try diyor  tutacak olan catch
                                                    // todo top == hata

    public static void main(String[] args) {

        System.out.println("Kodumuz calismaya basliyor....");


            int sayimiz = 0;

            try {
                sayimiz=2/0;
                System.out.println("Bu String Try icindedir");

            }catch (ArithmeticException bolmehatasi){
                System.out.println(bolmehatasi.getMessage());
            }

        System.out.println(sayimiz);
        System.out.println("Kodumuz bitiriliyor....");



    }
}
