import java.util.Arrays;

public class P30_S8 {
    public static void main(String[] args) {
//
		int n[][] = { { 1, 3 }, { 2, 4 } };
		for (int i = n.length - 1; i >= 0; i--) {  // i=1, i=0

			//System.out.println(Arrays.toString(n[i]));

			for (int y : n[i]) {    // n[1], n[0]
				System.out.print(y);
			}
		}



        // baska kaynak icin deeneme
//
//        int n[][] = { { 1, 3 }, { 2, 4 } };  // n.length=2
//        for (int i = n.length - 1; i >= 0; i--) {
//            for (int j = n[i].length - 1; j >=0 ; j--) {
//
//            	// 11,10,01,00
//                System.out.println(n[i][j]);  // n[1][1]=4, n[1][0]=2 ,n[0][1]=3 ,n[0][0]=1
//            }
//        }

    }
}
