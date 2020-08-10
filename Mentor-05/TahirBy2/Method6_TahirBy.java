package Mentor.TahirBy2;

public class Method6_TahirBy {/*
    int [] arr={1,34,5,678,34,56,7,8,};
        int search=78;

        - 78 sayisi verilen arrayde var mi?
        -iki parametreli method kullanin
        - eger return tipi kullancaksaniz boolean kullanin
     */


    public static void main(String[] args) {

        int [] arr={1,34,5,678,35,56,7,8,};
        int search=6;

        System.out.println(searchNumber(arr,search));


        // System.out.println(searchNumber(new int[]{1, 34, 5, 678, 35, 56, 7, 8,},8));
    }


    public static boolean searchNumber(int[]numbers,int search){

        boolean isThere=false;

        for (int num:numbers) {

            if(num==search){
                isThere=true;
                break;
            }

        }
        return isThere;

    }
}
