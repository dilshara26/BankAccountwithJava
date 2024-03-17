import java.util.ArrayList;
import java.util.Objects;

public class User extends Person {

    public ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    public User(String fullname, String birthday, String addres){
        super(fullname,birthday, addres );
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name= newName;
    }

    public void createBankAcc(String accNumber, String acctype){
        for (int i = 0; i < bankAccounts.size() ; i++) {
            if(Objects.equals(accNumber, bankAccounts.get(i).getAccountNumber())){
                System.out.println("This number already exist");
                return;
            }

        }
        BankAccount BA = new BankAccount(accNumber,acctype,name , birthdate,address);
        bankAccounts.add(BA);
        System.out.println("BANK ACC  created successfully for :" + name);

    }

    public void depositAccNumber(String accNumber, int amount){

        for (int i = 0; i < bankAccounts.size() ; i++) {
            if(Objects.equals(accNumber, bankAccounts.get(i).getAccountNumber())){
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
