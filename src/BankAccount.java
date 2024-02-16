public class BankAccount {
    public String accountNumber;
    public int balance;
    public String accountType;
    public String name;
    public String birthdate;
    public String address;

    public BankAccount(String accountNumber, String accountType,String name, String birthdate, String address ){
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        this.accountNumber= accountNumber;
        this.balance= 0;
        this.accountType = accountType;
    }

    public void withdrawal(int amount){
//        check the balance. if the amount requesting to withdraw is higher than the balance, then print cannot withdraw
//        if the balance is sufficient deduct the amount from balance and print withdraw
        if(this.balance>=amount){
            this.balance = this.balance - amount;
            System.out.println("Withdrawal successful");
        }
        else{
            System.out.println("Sorry cannot withdraw. Your balance is " + this.balance);
        }

    }
    public void deposit(int amount){
        this.balance = this.balance + amount;
    }
    public int getBalance(){
        return this.balance;
    }

}
