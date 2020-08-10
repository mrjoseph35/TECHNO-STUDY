package Mentor.BurakBy.ClassMethods;

public class b_Static_vs_NonStatic {
    // todo Static Method ve Non-Static Method
    public static void main(String[] args) {
        static_Method();
        //non_StaticMethod();  static olmadigi icin direk cagiramiyoruz

        b_Static_vs_NonStatic newObje = new b_Static_vs_NonStatic();  // static olmayan method ancak bu islemden sonra aktif olur...
        newObje.non_StaticMethod();

    }
    // todo  void = hiclik   bu methoddan birsey dondurmene gerek yok demek
    public void non_StaticMethod(){

        System.out.println("Merhaba");

    }
    public static void static_Method(){

        System.out.println("Selamlar");
    }
}
