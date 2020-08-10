package Mentor.SemaHnm_GrupCalisma;
class StudentRecord{
    int rollNo;
    String name;

    // data girisi icin method olusturuyoruz
    void insertRecord(int r,String n){
        rollNo = r;
        name = n;
    }
    // verileri yazdiran method

    void displayInformation(){
        System.out.println(rollNo+" "+name);
    }
}
public class TestStudent1 {
    public static void main(String[] args) {
        // object olusturuyoruz

        StudentRecord s1 = new StudentRecord();
        StudentRecord s2 = new StudentRecord();

        s1.insertRecord(1,"Sema");
        s2.insertRecord(2,"Zeynep");

        s1.displayInformation();
        s2.displayInformation();



    }

}
