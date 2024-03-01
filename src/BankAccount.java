import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    public String accountNumber;
    public int balance;
    public String accountType;
    public String name;
    public String birthdate;
    public String address;

//    global variables
    public ArrayList<Integer> deposits;
    public ArrayList<Integer> withdrawals;


    public BankAccount(String accountNumber, String accountType, String name, String birthdate, String address) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountType = accountType;
//        initialization
        this.deposits = new ArrayList<>();
        this.withdrawals = new ArrayList<>();
    }

    public void withdrawal(int amount) {
//        check the balance. if the amount requesting to withdraw is higher than the balance, then print cannot withdraw
//        if the balance is sufficient deduct the amount from balance and print withdraw
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Sorry cannot withdraw. Your balance is " + this.balance);
        }

    }

    // simple example for the while loop
    public void withDraw(){
        Scanner scr =new Scanner(System.in);  //Used Scanner class to get the user inputs
        System.out.println("Enter the amount to withdraw: ");
        int amount =scr.nextInt();

        while(amount > this.balance){
            System.out.println("Sorry , you don't have enough money");
            System.out.println("Your current balance is: "+ this.balance);
            System.out.println("Enter a valid amount to withdraw: ");
            amount =scr.nextInt();
        }
        this.balance -= amount;
        withdrawals.add(amount);
        System.out.println("Withdrawl sucessfull.Remaing balance:" + this.balance);

    }
    public void deposit(int amount) {
        deposits.add(amount);
        this.balance = this.balance + amount;
        System.out.println(deposits);
    }
    public void printAllDeposits(){

    }

    public int getBalance() {
        return this.balance;
    }

    // Case study Part 2
    public double calculateTotalValue(int year) {
        double interestRate;

        if (this.accountType.equals("sa")) {
            interestRate = 0.02;
        }else{
            if(year <2){
                interestRate =0.125;
            }else if(year <5){
                interestRate =0.165;
            }else{
                interestRate = 0.20;
            }
        }
        return this.balance * Math.pow(1 + interestRate, year);
    }
}
