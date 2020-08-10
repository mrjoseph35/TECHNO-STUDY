package Mentor.OmerBy.b_CumleBolme;

public class textClass {
    String text1 ="techno study avrupa sınıfı";
    String text2 ="Java kursu devam ediyor";


    String getTextBirlestir(String text1,String text2){

        int text1Yarisi = text1.length()/2;
        int text2Yarisi = text2.length()/2;

        String newText = text1.substring(0,text1Yarisi)+" " +text2.substring(text2Yarisi);

        return newText;
    }
    String getIlkYarisi(String text){

        int baslangic=0;
        int ortasi = text.length()/2;
        return text.substring(baslangic,ortasi);
    }

    String getIkinciYarisi(String text){
        int ortasi = text.length()/2;

        return text.substring(ortasi);
    }

}
