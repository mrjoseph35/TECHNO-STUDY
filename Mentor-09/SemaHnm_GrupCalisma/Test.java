package Mentor.SemaHnm_GrupCalisma;
class Demo{
    int a,b;
    Demo(){        // Constructor Class adi ile ayni olmak zorunda
        a= 10;          // Constructor ayni zamanda ilk deger atamak icinde kullanilir
        b= 20;
    }
    public void print(){
        System.out.println("a= "+a+" b= "+b );
    }
}

public class Test {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = obj1;           // Burda 1 obje olusmus oldu . Bir objeye 2 variable olmus oldu
        Demo obj3 = obj2;
        obj1.a+=1;
        obj2.b+=1;              // todo objeler birbirine esitlendigi icin deger hepsinde ayni oluyor
        obj1.print();
        obj2.print();
        obj3.print();

    }
}
