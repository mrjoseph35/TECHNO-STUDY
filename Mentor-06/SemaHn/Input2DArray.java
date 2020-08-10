package Mentor.SemaHn;

import java.util.Scanner;

public class Input2DArray {
    /*
     int[][] m = new int[2][4];
     Ekrandan 2D Array in elementlerini alan ve bunlarin toplamini yazdiran Java programini yaziniz
     task1-->Scanner class  ile ekrandan 2D Array in degerlerini alabilen kod parcasini yaziniz.
     */

    public static void main(String[] args) {


        int[][] intArray = new int[2][4];


        System.out.println(toplam(intArray));
    }

    public static int toplam(int[][] intArray){
        Scanner sc= new Scanner(System.in);
        int tplm=0;

        for (int i = 0; i <intArray.length ; i++) {
            for (int j = 0; j <intArray[i].length ; j++) {
                System.out.println("Sayi giriniz: ");
                intArray[i][j]=sc.nextInt();

                tplm+= intArray[i][j];
            }

        }
        return tplm;
    }
}
