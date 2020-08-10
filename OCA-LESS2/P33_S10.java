import java.util.ArrayList;
import java.util.List;

public class P33_S10 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
      //  names.add("Jon");
        names.remove("Jon");

//       boolean b= names.remove("Tahir");
//        System.out.println(b);

        if(names.remove("Bran")){
            names.add("Jon");
        }
       System.out.println(names);

    }
}
