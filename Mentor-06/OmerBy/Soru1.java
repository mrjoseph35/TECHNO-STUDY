package Mentor.OmerBy;

import java.util.ArrayList;

/*
Int arrayList oluşturun. 10 elemandan oluşmalı.
Random ekle isminde void bir method oluşturun ve parametresi int ArrayList olsun.

//todo Methodun içinde,
bu method, Arraylistin içine 0'dan 20 ye kadar random değer atasın.
Eğer çift sayı atarsa, o elemanın yerine 111 yazsın.
Eğer çift sayı yoksa "Çift sayı yoktur " mesajını versin.
     */
public class Soru1 {
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        RandomEkle(intList);

    }

    public static void RandomEkle (ArrayList<Integer> intList){

        int count=0;


        for (int i = 0; i <10 ; i++) {

            intList.add((int) (Math.random()*20+1));
        }
        System.out.println(intList);

        for (int i = 0; i <10 ; i++) {

           if(intList.get(i)%2==0)
            intList.set(i,111);
            else count++;
        }
        System.out.println(intList);
        if (count==0)
            System.out.println("Cift Yoktur");

    }

}
