package Mentor.ZeynepHnm;

public class Nedir {
    public static void main(String[] args) {
        //tipki carklara benziyor nested looplarin isleyisi
        //buyuk tek tur atarken kucuk olan cark cok daha fazla tur atabiliyor.
        //icerdeki loop distakinden once dongusunu tamamlar.

        //İç içe döngülerde en içteki döngü en önce tamamlanır.


        for(int i=0; i<=10; i++){

            for(int j=0; j< 4; j++){
                System.out.println("i = " + i + " " + "j = " + j);

            }System.out.println();
        }
        //todo  ayni sekli 1 tane # ile yazdiriniz
       // ##########
       // ##########
       // ##########
       // ##########
       // ##########
       // ##########
       // ##########
       // ##########
       // ##########
       // ##########

        for(int i=0; i<10; i++){

            for(int j=0; j<10; j++){
                System.out.print("#");
            }System.out.println();
        }
    }
}
