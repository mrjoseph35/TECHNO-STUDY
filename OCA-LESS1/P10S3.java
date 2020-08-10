import java.util.ArrayList;

public class P10S3 {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3, "cyan");
        //colors.set(0, "purple");
        System.out.print(colors);


    }
}