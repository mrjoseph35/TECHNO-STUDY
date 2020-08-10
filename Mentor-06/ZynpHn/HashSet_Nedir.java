package Mentor.ZynpHn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Nedir {
    public static void main(String[] args) {

/*

        HashSet

        degerlerin giris sirasina dikkat edilmez (linkedHashSet haric)

        ayni degerlerin birden fazla olmasina izin vermez

        sadece bir null degeri alabilir (treeSet haric)

        linkedHashSet                       TreeSet
        giris sirasina dikkat eder          alfabetik ya da kucukten buyuye

         */

        HashSet<String > set = new HashSet<>();

        set.add("kaplan");
        set.add("aslan");
        set.add("zurafa");
        set.add("fil");
        set.add("kedi");
        set.add("kedi");

        System.out.println("set---------- " + set);
        System.out.println("-----------");

        TreeSet<String> tree = new TreeSet<>();

        tree.add("kaplan");
        tree.add("aslan");
        tree.add("zurafa");
        tree.add("fil");
        tree.add("kedi");
        tree.add("kedi");

        System.out.println("tree_________" + tree);
        System.out.println("--------");

        LinkedHashSet<String> link = new LinkedHashSet<>();

        link.add("kaplan");
        link.add("aslan");
        link.add("kedi");
        link.add("zurafa");
        link.add("ayi");

        System.out.println("link-----" + link);


    }
}
