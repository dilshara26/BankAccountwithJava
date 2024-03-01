public class Main {

    public static void main(String[] args) {
        User umesh = new User("Umesh Rasanjana", "20th Nov","16/1" );
        User erandi = new User("Erandi Perera", "30th", "23/4");

        BankAccount umeshSavingAccount = new BankAccount("8010345","sa",umesh.name,umesh.birthdate,umesh.address);
        umeshSavingAccount.deposit(2000);
//        umeshSavingAccount.withdrawal(300);
        umeshSavingAccount.deposit(1000);
        umeshSavingAccount.deposit(500);
//        umeshSavingAccount.withdrawal(900);
        System.out.println("Umesh balance");
        System.out.println(umeshSavingAccount.balance);

//        BankAccount erandiFDAccount = new BankAccount("344353","fd",erandi.name, erandi.birthdate, erandi.address);
//        erandiFDAccount.deposit(1000);
//        System.out.println("Erandi balance");
//        System.out.println(erandiFDAccount.balance);
//        erandiFDAccount.withdrawal(5000);

//        System.out.println("-----------------------------");
//        System.out.println("Umesh balance");
//        System.out.println(umeshSavingAccount.balance);
//        System.out.println("Erandi balance");
//        System.out.println(erandiFDAccount.getBalance());

       // calculate total value after 2years for umesh's acc  - (PART 2)
//        int year = 1;
//        double totalValue = umeshSavingAccount.calculateTotalValue(year);
//        System.out.println("Total value after"+ year+ "years for umesh's accc:" + totalValue);
//
//        // while loop
//        System.out.println("--- Multiple Transaction for Umesh---");
//        umeshSavingAccount.withDraw();


    }
}