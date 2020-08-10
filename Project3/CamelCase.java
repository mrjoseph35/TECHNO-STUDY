package projeler.project3;

public class CamelCase {
    public static void main(String[] args) {



    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       For Example:

            my family live in united states

      Result should be

            My Family Live In United States

     */

    /*
            İlk harf büyük harfe
           parametre bir String dir
           return  türü String
          kelımeler arası tek boşluk ile sınırlandırılmalı
         Tüm kelimelerin ilk harfi camel case olmalıdır

       Örnek:

            my family live in united states

      Result :

            My Family Live In United States


     */
        System.out.println(camelcase("my family live in united states"));
    }
    public static String camelcase(String sentence) {
        String rStr = "";
        String[] arr = sentence.split(" ");
        for (String str : arr) {
            rStr += str.substring(0, 1).toUpperCase() + str.substring(1) + " ";
        }

        return rStr.substring(0, rStr.length() - 1);
    }


}
