package Mentor.SemaHn.Encapsulation.Student_1;

public class Main_Student {
    public static void main(String[] args) {

        Student student1 = new Student();
        // set student
        student1.setStudentRoll(1);
        student1.setStudentName("Suzanna");
        student1.setStudentAge(15);

        // display

        System.out.println("Ogrenci kayit numarasi: "+student1.getStudentRoll());
        System.out.println("Ogrenci adi: "+student1.getStudentName());
        System.out.println("Ogrenci yasi: "+student1.getStudentAge());
    }
}
