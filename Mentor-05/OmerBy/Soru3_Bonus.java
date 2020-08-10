package Mentor.OmerBy;

import java.util.ArrayList;
import java.util.Collections;

public class Soru3_Bonus {
     /*
İki adet Integer ArrayList  a   ve  b oluşturun.   İkisi de 6 elemandan oluşmalı. (int arraylist a   ve     int arraylist   b )


RandomEkleVeOrtakElemaniBul isminde bir method oluşturun.

Bu method, oluşturduğumuz iki int array ' e 0'dan 50 ye kadar random değer atasın.
Değerler atandıktan sonra bu iki int array  küçükten büyüğe sıralansın.

Devamında, bu iki array arasında ortak eleman olup olmadığı check edilsin.
Eğer ortak eleman varsa, o eleman yazılsın.
Eğer yoksa "Ortak eleman yoktur" mesajı gelsin.



OrtakElemanlariKaldir   adında void bir method oluşturun.
Bu method ise,  a ' dan ,   a ile   b nin ortak elemanlarını çıkartsın ve  int arraylistin a yeni halini yazdırsın.

Ve bu iki methodu main methodunda çağırın.


Konsol şöyle olmalı:
a  ilk hali :     [6, 18, 21, 31, 32, 47]
b ilk hali  :    [18, 19, 21, 36, 38, 40]
ortak elemanlar    :  18       ortak elemanlar    :  21
Ortak olanları çıkarttıktan sonra   ArrayList   a: [6, 31, 32, 47]

 */
     public static void main(String[] args) {

          ArrayList<Integer> intList1 = new ArrayList<>();
          ArrayList<Integer> intList2 = new ArrayList<>();

          RandomEkleVeOrtakElemaniBul(intList1,intList2);
          System.out.println();
          OrtakElemanlariKaldir(intList1,intList2);

     }

     public static  void   RandomEkleVeOrtakElemaniBul(ArrayList<Integer> intList1, ArrayList<Integer> intList2){

          for (int i=0; i<6; i++){
               intList1.add((int) (Math.random()*50+1));
          }
          System.out.println(intList1);


          for (int i=0; i<6; i++){
              intList2.add((int) (Math.random()*50+1));
          }
          System.out.println(intList2);

          ArrayList<Integer> ortakList= new ArrayList<>();

          int count=0;
          for (int i = 0; i < intList1.size() ; i++) {
               for (int j = 0; j < intList2.size(); j++) {

                    if (intList1.get(i).equals(intList2.get(j))){
                         count++;
                         ortakList.add(intList1.get(i));
                    }
               }

          }if (count==0)
               System.out.println("Ortak elemanlar yoktur ");

          if (count>0)  System.out.println("Ortak elemanlar: "+ortakList);
          }

     public static void OrtakElemanlariKaldir(ArrayList<Integer> intList1, ArrayList<Integer> intList2){

          int count=0;

          for (int i = 0; i < intList1.size() ; i++) {
               for (int j = 0; j < intList2.size(); j++) {

                    if (intList1.get(i).equals(intList2.get(j)))
                         count++;
               }
          }if(count>0)

          intList1.removeAll(intList2);
          System.out.println(intList1);

     }
}
