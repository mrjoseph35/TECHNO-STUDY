package Mentor.TahirBey;

public class indexOf {
    public static void main(String[] args) {
        String str = "aacabaaab";

        System.out.println(str.indexOf('a'));   // String icinde birden fazla "a" varsa ilk buldugunun index ini verir
        System.out.println(str.indexOf('a', 1));   // verilen konumdan(index degil normal sira no su) sonraki ilk "a" yi verecek
        System.out.println(str.indexOf('a', 8));
        System.out.println(str.indexOf('b'));
        System.out.println(str.indexOf('b', 7));

        String s = "Benim ismim Tahir ";
        String istenilen = "Benim ismym Tahir";
        int iIndex = istenilen.indexOf('i', 6);

        //   System.out.println(s.replace((iIndex),'y'));  TODO bu kodun dogrusunu bul !!!


    }
}

