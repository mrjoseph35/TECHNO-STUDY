package Mentor.TahirBy2;

public class Method6 {
    /*
   int [] arr={1,34,5,678,34,56,7,8,};
       int search=78;
       78 sayisi array da var mi
       2 parametreli method kullanin
    */
    public static void main(String[] args) {

        int [] arr={1,34,5,678,34,56,7,8,};

        int search=78;
        int search2=7;

        System.out.println(varMi(arr,search));
        System.out.println(varMi(arr,search2));


    }

    public static Boolean varMi(int[] array, int search ){

        boolean mesaj=false ;  // boolean defoult degeri false

        for(int i=0; i<array.length; i++){

            if (array[i]==search)
                mesaj = true;
                    break;

            } return mesaj;

    }
}
