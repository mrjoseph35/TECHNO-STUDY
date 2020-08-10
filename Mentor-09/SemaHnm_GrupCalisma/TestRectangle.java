package Mentor.SemaHnm_GrupCalisma;
class Rechtangle{
    int length;
    int width;

    void insert(int l,int w){
        length = l;
        width = w;
    }

    void calculateArea(){
        System.out.println(length*width);
    }

}
public class TestRectangle {
    public static void main(String[] args) {

        Rechtangle r1 = new Rechtangle();
        Rechtangle r2 = new Rechtangle();
        r1.insert(4,5);
        r2.insert(6,5);

        r1.calculateArea();
        r2.calculateArea();

    }
}
