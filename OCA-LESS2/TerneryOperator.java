public class TerneryOperator {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        String str="";

//        if(a>b){
//            str="Java";
//        }else{
//            str="Python";
//        }
//
//        str=(a>b)?"Java":"Python";
//        System.out.println(str);

        System.out.println("*************************************************");

        int c=0;

        String st="";

//        if(c>0){
//            st="Java";
//        }else if(c<0){
//            st="Python";
//        }else{
//            st="C++";    // c=0
//        }

        st=(c>0)?"Java":(c<0)?"Python":"C++";
        System.out.println(st);
// Soru isareti kadar :(iki nokta ust uste) olmali
        System.out.println("*************************************************");


    }
}
