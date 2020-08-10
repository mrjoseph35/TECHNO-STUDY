package Mentor.BurakBey.Do_While_Loop;

public class Do_While_Loop3 {
    public static void main(String[] args) {

        // Todo Do-While da Sart while ile sonda oldugu icin bloga girer 1 kere yazdirir.
        //  Sonra kontrol eder. Sarta uygun degil cikar.

        int count = 11;

        while(count < 11) {    //KOŞUL SAĞLANMADIĞINDA ÇALIŞMAZ

            System.out.println("Count is: " + count);
            count++;
        }

        int doCount = 11;
        do{                     //KOŞUL SAĞLANMADIĞINDA DAHİ DO BİR KERE ÇALIŞIR.

            System.out.println("DoCount is: " + doCount);

            doCount++;

        } while(doCount < 11);
    }
}
