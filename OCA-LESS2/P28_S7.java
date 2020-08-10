public class P28_S7 {
    public static void main(String[] args) {
        String ta= "A ";
        ta= ta.concat("B "); //A B
        String tb="C ";
        ta=ta.concat(tb);    //A B C
        ta.replace('C', 'D'); //atama yapilmamis
        ta=ta.concat(tb);
        System.out.println(ta); // A B C C

//        String str="J";
//        str=str.replace("J","K");
//        System.out.println(str);


    }
}
