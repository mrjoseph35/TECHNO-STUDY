package Mentor.SemaHnm_GrupCalisma;

import javax.naming.NameAlreadyBoundException;

class Account{
    int acc_no ;
    String name;
    float amount;

    // data alabilecegimiz method olusturduk
    void insert(int a,String n,float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }

    // deposit para yatirma methodu
    void deposit(float amt){
        amount+=amt;
        System.out.println(amt + " yatirildi...");
    }
    // para cekme methodu
    void withdraw(float amt){

        if (amount<amt){
            System.out.println("Yetersiz bakiye...");
        }else {
            amount-=amt;
            System.out.println(amt+" cekildi...");
        }
    }

    // hesabimdaki paranin miktari
    void checkBalance(){
        System.out.println("Balance : " + amount);
    }
    // Hesap Bilgileri
    void display(){
        System.out.println(acc_no+ " "+name+" "+ amount);
    }
}
public class TestAccount {
    public static void main(String[] args) {

        Account a1 = new Account();
        a1.insert(1111,"Sema",2000);
        a1.display();
        a1.checkBalance();
        a1.deposit(1000);
        a1.checkBalance();
        a1.withdraw(500);
        a1.checkBalance();
        a1.withdraw(3000);


    }
}
