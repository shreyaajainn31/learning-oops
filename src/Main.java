import Encapsulation.BankingApplication;

public class Main {
    
    public static void main(String[] args) {
        BankingApplication bankingApplication = new BankingApplication("shreya", 0);
        System.out.println(bankingApplication.withdraw(100));
        System.out.println(bankingApplication.deposit(100));
        System.out.println(bankingApplication.withdraw(100));
    }
    

}
