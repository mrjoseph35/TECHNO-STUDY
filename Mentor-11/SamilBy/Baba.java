package Mentor.SamilBy;

public class Baba extends Dede{
    boolean araba;

    public Baba() {

    }

    public Baba(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Baba{" +
                "araba=" + araba +
                ", boy=" + boy +
                ", torun=" + torun +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", jop='" + jop + '\'' +
                ", tatlisever=" + tatlisever +
                '}';
    }
}
