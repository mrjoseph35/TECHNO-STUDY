package Mentor.TahirBy;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
        //TODO verilen arrayin ilk ve son elemanin yazdirin
        //int[]nums={1,2,3,4,5}   ======>  [1,5]
        // eger 1,5 seklinde olsaydi direk System.out.println diyerek yazdirabilirdik

        int[]nums={1,2,3,4,5};

     //   System.out.println(nums[0]);
     // System.out.println(nums[nums.length-1]);


        int first = nums[0];               // genel bir tanim her zaman 0.index vardir
        int last = nums[nums.length-1];   // genel bir tanim... arrayin uzunluguna gore calisir
      //  int last =nums[4];              //

        int[] arr = new int[2];
        arr[0]=nums[0];
        arr[1]=nums[nums.length-1];
        System.out.println(Arrays.toString(arr));

    }
}
