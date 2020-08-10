package Mentor.SemaHn;

public class SayiBul {
    /*
     int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
      verilen Array icinde
    --> kac tane sayi oldugunu return eden  methodu yazdiriniz
     */
    public static void main(String[] args) {
        int[][] array={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        System.out.println(kacRakamVar(array));
    }

    public static int kacRakamVar (int [][] intArr){
        int count=0;

        for (int i = 0; i <intArr.length ; i++) {
            for (int j = 0; j <intArr[i].length ; j++) {

                count++;
            }
        }


        /* todo 2 for each ile cozumu
        for (int[] arr : array)
            for (int n : arr)
                count++;
         */
        return count;
    }

}
