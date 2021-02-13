package lesson_4_Java_Classes;

public class BankAccount {

    int id=1;
    String name;
    double balance;

    double popolnenieScheta(double zachislenie){
        balance+=zachislenie;
        System.out.println(balance);
        return balance;
    }
    double snyatieSoSheta(double snyatie){
        balance-=snyatie;
        System.out.println(balance);
        return balance;

    }


    public static void main(String[] args) {

        BankAccount ba=new BankAccount();//создали обьект с именем ba, калсса BankAccount
        ba.name="Vlad";
        ba.balance=205.65;
        ba.snyatieSoSheta(20.);

        ba.popolnenieScheta(150.0);

    }
}
