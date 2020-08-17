public class P81_S19 {
    public static void main(String[] args) {
        String [] arr= {"A","B","C","D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");      // arr[0]=A
            if(arr[i].equals("C")){  // C yerine A yazip dene
                continue;

               // break;
            }
            System.out.println("Work Done");
            break;
            //continue;
        }

    }

}
