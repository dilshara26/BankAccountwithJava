import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String name;
    public  String birthdate;
    public String address;

    public ArrayList<BankAccount> bankAccounts = new ArrayList<>();


    public User(String name, String birthdate, String address){
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name= newName;
    }

    public void createBankAcc(String accNumber, String acctype){
        BankAccount BA = new BankAccount(accNumber,acctype,name , birthdate,address);
        bankAccounts.add(BA);
        System.out.println("BANK ACC  created successfully for :" + name);
    }

    public void depositedAccNumber(String accNumber, int amount){

        for (int i = 0; i < bankAccounts.size() ; i++) {
            if(Objects.equals(bankAccounts.get(i).accountNumber, accNumber)){
                bankAccounts.get(i).deposit(amount);
            }

        }

    }

    public int getTotalBalance(){
       int totalBalance = 0;
        for (int i = 0; i <bankAccounts.size() ; i++) {
            int accBalance = bankAccounts.get(i).getBalance();
            totalBalance += accBalance;

        }
        return totalBalance;
    }


}
