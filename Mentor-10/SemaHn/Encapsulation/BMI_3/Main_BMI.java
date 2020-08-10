package Mentor.SemaHn.Encapsulation.BMI_3;

public class Main_BMI {
    public static void main(String[] args) {

        BMI bm1 = new BMI("Alice",18,80,1.60);
        System.out.println("BMI: " +bm1.getName()+" "+ bm1.getStatus()+" " + bm1.getBMI());

    }
}
