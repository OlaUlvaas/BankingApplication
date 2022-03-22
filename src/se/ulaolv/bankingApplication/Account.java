package se.ulaolv.bankingApplication;

public class Account {
    private int id;
    private String name;
    private int balance;
    private int previousTransaction;

    public Account() {

    }

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void desposit(int money) {
        if (money > 0) {
            balance += money;
            previousTransaction = money;

        } else
            System.out.println("wrong input");

    }

    public void withdraw(int money) {
        if (balance >= money) {
            balance -= money;
            previousTransaction = - money;

        } else
            System.out.println("not enought money on the account");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public int getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Previous transaction: " + " + " + previousTransaction);
            return previousTransaction;
        } else {
            System.out.println("Previous transaction: " + previousTransaction);
            return previousTransaction;
        }

    }
}