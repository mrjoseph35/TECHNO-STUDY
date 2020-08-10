package Mentor.ZeynepHn.tasks.Task1;
    /*
    //isim, bolum ve deneyim instance variable (degiskenlerini) iceren bir Ogretmen class i olusturunuz.
    //ogretmenimNasil adli bir method icinde deneyim yilina gore ogretmenin kalitesini olcun.
     */

public class Ogretmen {
    String name;
    String bolum;
    int deneyim;

//    public  Ogretmen creatTeacher(){
//        Ogretmen ogretmen= new Ogretmen();
//        ogretmen.name=name;
//        ogretmen.bolum=bolum;
//
//        return ogretmen;
//    }
    String ogretmenimNasil(){

        if (deneyim<2){
            return "Idare Eder";
        }
        else if((deneyim>=2)&&(deneyim<=4)){
            return "Daha iyisi olabilirdi";
        }
        else if(deneyim>4){
            return "Daha ne olsun, Ogretmen Super";
        }
        return "Ogretmen Degistirmeyi talep ediyorum";
        // return "";  bos da return edilebilirdi
    }

}
