public class Main {

    public static void main(String[] args) {
        User umesh = new User("Umesh Rasanjana", "20th Nov","16/1" );
        User erandi = new User("Erandi Perera", "30th", "23/4");
        erandi.makeBirthdayWish();
        erandi.setRoughSalary(1000);
        Employee manupaEmployee1  = new Employee("Manupa", "16th", "16;1", "Manager", 2000);
        System.out.println(manupaEmployee1.name);
        System.out.println(manupaEmployee1.salary);
        erandi.setRoughSalary(1000);
        manupaEmployee1.setRoughSalary(1000);

        System.out.println(erandi.getRoughSalary());
        System.out.println(manupaEmployee1.getRoughSalary());

//        BankAccount umeshSavingAccount = new BankAccount("8010345","sa",umesh.getName(),umesh.birthdate,umesh.address);
//        umeshSavingAccount.deposit(2000);
//        umeshSavingAccount.deposit(1000);
//        umeshSavingAccount.deposit(500);
//        umeshSavingAccount.deposit(4000);
//
//
//        //print all deposits
//        System.out.println("print all deposits");
//        umeshSavingAccount.printAllDeposits();
//
//        System.out.println("Print all the desposits from the end");
//        umeshSavingAccount.printAllDepositsFromEnd();
//
//        umesh.createBankAcc("123","sa");
//        umesh.createBankAcc("456","fd");
//        umesh.createBankAcc("456","fd");
//
//        //deposit money
//        umesh.depositedAccNumber("123",600);
//        umesh.depositedAccNumber("123",5000);
//        umesh.depositedAccNumber("456",300);
//
//
//        System.out.println("total balance of Umesh's acc:" + umesh.getTotalBalance());


//        umeshSavingAccount.withdrawal(900);
//        umeshSavingAccount.withdrawal(300);
//        System.out.println("Umesh balance");
//        System.out.println(umeshSavingAccount.balance);
//        BankAccount erandiFDAccount = new BankAccount("344353","fd",erandi.name, erandi.birthdate, erandi.address);
//        erandiFDAccount.deposit(1000);
//        System.out.println("Erandi balance");
//        System.out.println(erandiFDAccount.balance);
//        erandiFDAccount.withdrawal(5000);
//
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