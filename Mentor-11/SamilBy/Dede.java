package Mentor.SamilBy;

public class Dede extends BuyukDede{
    int boy;
    boolean baston;
    int torun;

    public Dede() {
    }
    public Dede(String name) {   // super class da constrtor oldugu icin
        super(name);
    }

    @Override
    public String toString() {
        return "Dede{" +
                "boy=" + boy +
                ", baston=" + baston +
                ", torun=" + torun +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", jop='" + jop + '\'' +
                '}';
    }
}
