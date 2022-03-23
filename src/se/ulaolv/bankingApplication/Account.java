package se.ulaolv.bankingApplication;



import java.util.Scanner;

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

    public int getBalance() {
        return balance;
    }

    public void calculateInterest(int years){
        double interestRate = Math.pow(1.0185, years);
        double newBalance = interestRate * balance;
        System.out.println("After " + years + " years, your balance will be " + Math.round(newBalance) + " SEK.");
    }

    public int previousTransactionMethod() {
        return previousTransaction;
    }

    public void menu(){
        char option = '0';
        boolean on = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome " + name + "!");
        System.out.println("Your id is: " + id);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A - Check your balance");
        System.out.println("B - Make a desposit");
        System.out.println("C - Make a withdraw");
        System.out.println("D - View previous transaction");
        System.out.println("E - Calculate interest");
        System.out.println("F - Exit");
        System.out.println();
        do{
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();
            switch (option){
                case 'A' :
                    System.out.println("***********************");
                    System.out.println("Balance: " + getBalance() + " SEK.");
                    System.out.println("***********************");
                    System.out.println();
                    break;

                case 'B' :

                    System.out.println("Enter an amount to desposit ");
                    int desposit = scanner.nextInt();
                    desposit(desposit);
                    System.out.println();
                    break;

                case 'C' :
                    System.out.println("Enter an amount to withdraw ");
                    int withdraw = scanner.nextInt();
                    withdraw(withdraw);
                    System.out.println();
                    break;

                case 'D' :
                    System.out.println("***********************");
                            if(previousTransactionMethod() > 0){
                                System.out.println("Desposit: " + previousTransaction + " SEK.");
                            }else
                                System.out.println("Withdraw: " + Math.abs(previousTransaction) + " SEK.");


                    System.out.println("***********************");
                    System.out.println();
                    break;

                case 'E' :
                    System.out.println("After how many years? ");
                    int years = scanner.nextInt();
                    calculateInterest(years);
                    break;

                case 'F' :
                    System.out.println("***********************");
                    System.out.println("Welcome back!");
                    System.out.println("***********************");
                    on = false;
                    break;

                default:
                    System.out.println("Wrong input, try again");
            }

        }while(on);

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




}