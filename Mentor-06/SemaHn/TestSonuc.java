package Mentor.SemaHn;

public class TestSonuc {
    /*
 ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz.

  //ogrencilerin cevaplari
  char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
*
* // cevap anahtari
  char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

  output:
  0 nolu ogrencinin 7 dogru cevabi var.
  1 nolu ogrencinin 6 dogru cevabi var.
           "           "
           "           "
           "           "
  7 nolu ogrencinin 7 dogru cevabi var.

*
*  */
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

 // cevap anahtari
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

       testSonuc(answers,keys);
    }

    public static void  testSonuc(char[][] charArr,char[] keys){
        int count;

        for (int i = 0; i <charArr.length ; i++) {
            count=0;
            for (int j = 0; j <charArr[i].length ; j++) {

               if( charArr[i][j]==keys[j])
                count++;
            }
            System.out.println((i+1)+ "nolu  ogrencinin " + count +" dogru cevabi vardir");

        }
    }
}
