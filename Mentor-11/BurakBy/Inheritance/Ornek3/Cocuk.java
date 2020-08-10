package Mentor.BurakBy.Inheritance.Ornek3;

public class Cocuk extends Insan{

    @Override
    void yemek(){
        kilo+=3;
    }

    @Override
    void spor(){
        kilo+=1;
    }

    @Override
    void buyume(){
        boy+=5;
    }
}
