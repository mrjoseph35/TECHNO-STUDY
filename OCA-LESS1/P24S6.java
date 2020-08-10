public class P24S6 {
    public static void main(String[] args) {

		for (int i = 0; i <10 ; i++) {
			if(i==4){
				continue;
			}
			System.out.println(i);
		}

        System.out.println("********************************************************");

		for (int i = 0; i <10 ; i++) {
            if(i==4){
                break;
            }
            System.out.println(i);
        }


        System.out.println("********************************************************");



//        int data[] = {2010, 2013, 2014, 2015, 2014};
//        int key = 2014;
//        int count = 0;
//        for (int e : data) {
//            if (e != key) {
//                count++;
//                //break;
//                continue;
//             // count++;
//            }
//            //count++;
//            //System.out.println(e);
//
//
//        }
//        System.out.println(count + " Found");
    }
}
