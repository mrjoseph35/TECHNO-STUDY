package Mentor.TahirBy2;

public class Method2 {
    // Parametreli method

    public static void main(String[] args) {
        String text = "Hello World";

        myMethod(text);
        myMethod("Java");
        myMethod2(123);

      //  System.out.println("Ben "+myMethod("Java") + " ogreniyorum");  myMethod da return olmadigi icin bu kullanim hata verir
        System.out.println("Ben "+myMethodYeni("Java") + " ogreniyorum");
    }
    public static void myMethod(String str){   // Parametre buraya yazildi

        System.out.println(str);
    }
    public static void myMethod2(int s1){

        System.out.println(s1);
    }
    public static String myMethodYeni (String str){

        return str;
    }
}
