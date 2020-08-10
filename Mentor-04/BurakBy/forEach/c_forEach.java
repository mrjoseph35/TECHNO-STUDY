package Mentor.BurakBy.forEach;

public class c_forEach {
    public static void main(String[] args) {
        // Todo For loop ile for each loop un farki

        String[] StringArray = {"Alpha", "Beta", "Gamma", "Delta"};

        System.out.println("For Loop : ");
        for(int i=0; i<StringArray.length; i++){

            System.out.println(StringArray[i]);
        }
        System.out.println("\nFor Each Loop : ");
        for(String yeniString : StringArray){
            System.out.println(yeniString);
        }
    }
}
