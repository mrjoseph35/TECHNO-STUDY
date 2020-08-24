public class P26_S24 {
    static int count=0;
    int i=0;
    public void changeCount() {
        while(i<5){
            i++;
            count++;
        }

//	    System.out.println("i= "+i);
//		System.out.println("count= "+count);

    }

    // static fieldi butun object degistirebiliyor
    // normal fieldler her object icin farkli
    public static void main(String[] args) {
//		S26 ob=new S26();
//		ob.changeCount();
        P26_S24  check1= new P26_S24 ();
        P26_S24  check2= new P26_S24 ();
        check1.changeCount();   // i=5;  count=5;   method islevi bittikten sonra(hafizada) ----- i=0; count=5
        check2.changeCount();   //  i=5; count=10;
//		System.out.println("check1 count= "+check1.count);
//		System.out.println("check2 count= "+check2.count);
       System.out.println(check1.count+ ":" + check2.count);
       // System.out.println(check1.i+ ":" + check2.i);
    }
}
