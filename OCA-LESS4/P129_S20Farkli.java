public class P129_S20Farkli {
   //  public static void test(int x, int y){
//	  x=x++;
//	  y=y++;
//  }
        public static void main(String[] args) {
            int x=1;
            int y=1;
            if(x++<++y){
                System.out.print("Hello ");}
            else{
                System.out.print("Welcome ");
            }
            //test(x, y);
            System.out.println("Log "+ x + ":" +y);

        }
}
