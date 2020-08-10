package Mentor.BurakBy.ClassMethods;

public class Car {
    // todo Static Olmayan methodlar

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.tamGaz();
        System.out.println("-----------");
        myCar.maxSpeed(500);

    }
    public void tamGaz(){
        System.out.println("Bu araba butun arabalardan daha hizli!!!");
    }
    public void maxSpeed(int speed){
        System.out.println("Bu arabanin maksimum hizi : " + speed);


    }

}
