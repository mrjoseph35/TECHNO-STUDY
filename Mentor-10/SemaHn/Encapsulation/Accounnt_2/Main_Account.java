package Mentor.SemaHn.Encapsulation.Accounnt_2;

public class Main_Account {
    public static void main(String[] args) {

        Account account1 = new Account(11111,"Ali","aaaa@gmail.com",1000);
//        Account account2 = new Account();
//        account2.setAcc_no(1000);
        System.out.println(account1.getAcc_no()+" "+account1.getName()+" "+account1.getEmail()+" "+account1.getAmount());

    }
}
