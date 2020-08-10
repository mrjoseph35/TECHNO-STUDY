package Mentor.BurakBy.split;

import java.util.Scanner;

public class a_split {
    public static void main(String[] args) {
        // Todo Bir Scanner olusturup bir atasozu giriniz
        // Gridiginiz atasozunde her " " (bosluk) da split methodu uygulansin

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir atasozu giriniz : ");
        String atasozu = sc.nextLine();

        String[] kelime =atasozu.split(" ");  // harfte kullanabilirdik

        for (String yeniKelime : kelime){
            System.out.println(yeniKelime);

        }
    }
}
