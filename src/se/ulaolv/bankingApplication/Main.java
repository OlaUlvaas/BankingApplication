package se.ulaolv.bankingApplication;

public class Main {

    public static void main(String[] args) {
	Account ola = new Account(1, "Ola");
    Account per = new Account(2, "Per");

    System.out.println(ola.getBalance());
    ola.desposit(1000);
    per.desposit(128);
    System.out.println(ola.getBalance());
    System.out.println(per.getPreviousTransaction());
    ola.withdraw(123);
    System.out.println(ola.getBalance());
    System.out.println(ola.getPreviousTransaction());
    ola.withdraw(228);
    System.out.println(ola.getBalance());

    }
}
