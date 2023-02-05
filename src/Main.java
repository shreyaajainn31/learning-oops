import Encapsulation.BankAccount;
import Inheritance.ModArrayList;

public class Main {
    
    public static void main(String[] args) {
        BankAccount bankingApplication = new BankAccount("shreya", 0);
        System.out.println(bankingApplication.withdraw(100));
        System.out.println(bankingApplication.deposit(100));
        System.out.println(bankingApplication.withdraw(100));

        // Inheritance
        ModArrayList list = new ModArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.getModValue(0));
        System.out.println(list.getModValue(-15));
        System.out.println(list.getModValue(121));

    }
    

}
