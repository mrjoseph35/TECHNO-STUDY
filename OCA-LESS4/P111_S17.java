public class P111_S17 {
    public static void main(String[] args) {
        int x=100;
        int a= x++;
        int b=++x;   // x=102
        int c=x++;    // c=102
       //int i=0;

      int d=(a<b)? (a<c)?a:(b<c)? b:c:x ;  // sorunun aslinda x: yok
      //  int d=(a<b)?a:(a<c)?b:(b<c)?c:x;



//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);  // c=102
//        System.out.println(x); // x=103
      // int d=(a<b)? (a<c)?(b<c)?a: b:c:x ;
        // compilation fails


//        int d;
//        if(a<b){
//            d=a;
//        }else if(a<c){
//            d=b;
//        }else if(b<c){
//            d=c;
//        }else {
//            d=x;
//        }
//
//


        System.out.println(d);
    }
}
