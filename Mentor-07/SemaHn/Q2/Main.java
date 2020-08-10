package Mentor.SemaHn.Q2;
class Test{
   int i;         // defoult   0
   //String i;      // defoult  null
  // char i;        // defoult  ' '  -bosluk
   //boolean i;     // defoult  false
   //float i;       // defoult  0.0
  //double i;       // defoult  0.0
  // byte i;          // defoult  bosluk
}
class Main {
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.i);
    }
}
/*
0       dogru cevap
garbage value
compiler error
runtime error
 */