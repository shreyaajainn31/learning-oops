import Encapsulation.BankAccount;

public class Main {
    
    public static void main(String[] args) {
        BankAccount bankingApplication = new BankAccount("shreya", 0);
        System.out.println(bankingApplication.withdraw(100));
        System.out.println(bankingApplication.deposit(100));
        System.out.println(bankingApplication.withdraw(100));
    }
    

}
