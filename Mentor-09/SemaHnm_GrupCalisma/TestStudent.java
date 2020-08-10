package Mentor.SemaHnm_GrupCalisma;
class Student{
    // field, attribute
    int id;
    String name;

}
public class TestStudent {
    public static void main(String[] args) {
        // main icinde ise  Local variable oluyor
        int id = 0;
        // object olusturma
        Student s1 = new Student();   // Run yapinca heap memory de obje olusmus oluyor
        s1.name ="Sema";
        s1.id = 1;

        // print object
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(id);


    }
}
