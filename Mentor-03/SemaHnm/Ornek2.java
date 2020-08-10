package Mentor.SemaHnm;

public class Ornek2 {
    public static void main(String[] args) {

        String myStr = " ";
        myStr.trim();       // bu satiri myStr degeri ile esitlemedigimiz icin if bloguna bosluk degeri ile gider
                            // myStr = myStr.trim();  olarak yapsaydik... if boluguna bosluk kismini silerek gidecekti

        if (myStr.isEmpty()) {
            System.out.println("yeap");
        }else {
            System.out.println("nope");
        }
    }
}
