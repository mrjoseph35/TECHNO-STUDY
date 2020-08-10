public class P44S9 {
    public static void main(String[] args) {
        String stuff="TV";
        String res=null;
//
//        if(stuff.equals("TV")){
//            res="Walter";
//        }else if(stuff.equals("Movie")){
//            res="White";
//        }else{
//            res="No Result";
//        }

        //res = stuff.equals("TV") ? "Walter":stuff.equals("Movie") ? "White":"No Result";
        //res=stuff.equals("TV")?"Walter":stuff.equals("Movie")?"White":"No Result";
        //res=stuff.equals("TV")?stuff.equals("Movie")?"Walter":"White":"No result";
        res=stuff.equals("TV")?"Walter":stuff.equals("Movie")?"White":"No result";

        System.out.println(res);
    }
}
