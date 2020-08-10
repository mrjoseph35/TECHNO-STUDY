public class SwitchCase {
    public static void main(String[] args) {
        int a=3;

        switch (a){
            case 0:
                a++;
               // break;

            case 1:
                a++;
               // break;

            case 3 :
                a++;
                //continue;
                //break;

            case 4 :
                a++;
                break;
//            case 3:
//                a+=2;
//            case 4:
//                a+=2;
//
//            default:
//                a++;
        }

        System.out.println(a);




// break olmadigi zaman bir sonraki case saglanmazsa bile o case giriyor
    }
}
