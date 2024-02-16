public class Main {

    public static void main(String[] args) {
        User umesh = new User("Umesh Rasanjana", "20th Nov","16/1" );
        User erandi = new User("Erandi Perera", "30th", "23/4");

        BankAccount umeshSavingAccount = new BankAccount("8010345","sa",umesh.name,umesh.birthdate,umesh.address);
        umeshSavingAccount.deposit(2000);
        System.out.println("Umesh balance");
        System.out.println(umeshSavingAccount.balance);
        BankAccount erandiFDAccount = new BankAccount("344353","fd",erandi.name, erandi.birthdate, erandi.address);
        erandiFDAccount.deposit(1000);
        System.out.println("Erandi balance");
        System.out.println(erandiFDAccount.balance);
        erandiFDAccount.withdrawal(500);

        System.out.println("-----------------------------");
        System.out.println("Umesh balance");
        System.out.println(umeshSavingAccount.balance);
        System.out.println("Erandi balance");
        System.out.println(erandiFDAccount.getBalance());

    }
}