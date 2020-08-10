package Mentor.SemaHnm;

public class Ornek1 {
    public static void main(String[] args) {
        int myVar = 9; //OCA question(post increment, pre increment)
        if (myVar++<10){     // burda isleme girmeden once if bloguna girdigi icin TODO 9<10 oluyor!!!!!
            System.out.println(myVar+ "Hello World");
        }else {
            System.out.println(myVar+ "By bye world");
        }

    }
}
