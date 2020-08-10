package Mentor.OmerBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Soru2 {
    /*
String arrayList oluşturun. 5 elemandan oluşturun.

1.   elemanEkle isminde bir method oluşturun
ve bana String Arraylist döndürsün. Parametre olarak String arraylist.
Scanner kullanarak  5 özel isim girin ve bu isimler bu methodda ArrayListe eklensin. (Hüseyin, Ömer,Nalan vb.)


2.    sil    isminde void bir method çağırın.
Parametresi String ArrayList olsun.
ArrayListimin içindeki elemanlar "l" (en az bir eleman  "küçük L"  harfine sahip olması koşul için yeterlidir.) harfine sahipse, bütün arrayList temizlensin. (silinsin, boşaltılsın.)

3.    listeBosMu   adında void bir method oluşturun.
ve  parametresi    String  ArrayList olsun.
Listenin boş olup olmadıgını check etsin. Liste boş ise true,  boş değil ise false döndürsün.  (ArrayList methodu kullanın.)
Liste boş ise  listeyi yazdırıp check edin.


Konsoldaki görüntü bunun gibi olmalı(Kendi değerlerinizi girerek deneyin)

1. elemanı giriniz:  ömer
2. elemanı giriniz:  hüseyin
3. elemanı giriniz:  nalan
4. elemanı giriniz:  sevket
5. elemanı giriniz:  osman
[ömer, hüseyin, nalan, sevket, osman]

L harfi bulunanlar : nalan
Liste boşaltılmıştır...

ArrayList boş mu ? =    true
Arraylist'im boştur =   []

 //  ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Cigdem","Sinem","Zulal","Ihsan","Hasan"));
*/
    public static void main(String[] args) {


        ArrayList<String> isimler = new ArrayList<>(elemanEkle());


        System.out.println("\nArraysList isimler = " + isimler);
        clear(isimler);

        System.out.println("\nArrayList bos mu? : "+listeBosMu(isimler));

        if (isimler.isEmpty()){
            System.out.println("ArrayList im bostur : "+isimler);
        }else System.out.println("ArrayList im bos degildir : "+isimler);

    }

     public static ArrayList<String> elemanEkle(){
         ArrayList<String> strList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
         System.out.println("\nLutfen 5 isim giriniz...");

         for (int i = 0; i <5 ; i++) {

             System.out.print((i+1)+ ". ismi giriniz : ");
             String isim = sc.nextLine();

             strList.add(isim);
         }
        return strList;
    }
    public static void clear(ArrayList<String> strList){

        for (int i = 0; i <strList.size() ; i++) {

            if(strList.get(i).contains("l")){
                System.out.println("\nl harfi bulanan deger :  "+strList.get(i));
                strList.clear();
                System.out.println("Liste bosaltilmistir...");
            }
        }
        if (strList.size()>0)
            System.out.println("\nl harfi bulunan degeriniz yoktur...");
    }

    public static boolean listeBosMu(ArrayList<String> strList){
        return strList.isEmpty();
    }
}
