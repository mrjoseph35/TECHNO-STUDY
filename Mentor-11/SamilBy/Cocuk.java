package Mentor.SamilBy;

public class Cocuk extends Baba{
    boolean bisiklet;

    public Cocuk() {
    }

    public Cocuk(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cocuk{" +
                "bisiklet=" + bisiklet +
                ", boy=" + boy +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
