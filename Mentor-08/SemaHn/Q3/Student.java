package Mentor.SemaHn.Q3;
public class Student {
    int id;
    String name;
    String city;
    Student(int i, String n){
        id=i;
       name=n;
    }
    Student(int i, String n, String c){
        id=i;
        name=n;
        city=c;
    }
    void display(){
        System.out.print("id:"+id+" name:"+name+" city:"+city+" ");
    }
    public static void main(String[] args) {
        Student s=new Student(1,"Ali");
        Student s2=new Student(2,"Ahmet","Istanbul");
        s.display();
        s2.display();
    }
}





