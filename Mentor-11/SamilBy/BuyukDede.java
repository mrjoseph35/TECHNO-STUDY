package Mentor.SamilBy;
// todo super class
public class BuyukDede {
    String name;
    String surname;
    int age;
    String jop;
    boolean tatlisever;

    public BuyukDede() {
    }

    public BuyukDede(String name) {  // todo Generate  üret demek
        this.name = name;
    }

    @Override
    public String toString() {
        return "BuyukDede{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", jop='" + jop + '\'' +
                ", tatlisever=" + tatlisever +
                '}';
    }
}
