package Mentor.ZeynepHnm;

public class LabelledLoop {  // isim vererek donguyu ismine gore sonlandirma
    public static void main(String[] args) {
        OUTER_LOOP:
        for (int i = 1; i < 10; i++) {

            INNER_LOOP:
            for (int j = 1; j < 10; j++) {

                if (j ==4)
                    break OUTER_LOOP; ;
                System.out.println( i + "*" + j + " = " + i*j);

            }
            System.out.println();

        }

    }
}
