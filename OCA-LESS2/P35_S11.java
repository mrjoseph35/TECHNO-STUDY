public class P35_S11 {
    public static void main(String[] args) {
        int numbers[];
        numbers= new int[2];
        numbers[0]=10;
        numbers[1]=20;

        numbers= new int[4];
        numbers[2]=30;
        numbers[3]=40;

        for (int x: numbers){
            System.out.println(x);


        }



        System.out.println("****************************************");
        String[] num= new String[4];
        num[2]="30";
        num[3]="40";

        for (String y: num){
            System.out.println(y);



    }
}}
