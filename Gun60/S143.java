package Gun60;

public class S143 {
    public static void main(String[] args) {
        int num[][] = new int [1][3];

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                num[i][j] = 10;
            }
        }

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.println("num["+i+"]["+j+"]="+ num[i][j]);
            }
        }
    }
}
// A şıkkı

//num[0][0]=10
//        num[0][1]=10
//        num[0][2]=10
