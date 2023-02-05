package Encapsulation;

public class BankAccount{
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance= balance;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getOwner(){
        return owner;
    }

    public int balance(){
        return balance;
    }

    public String withdraw(int withdrawAmount){
       
        if(withdrawAmount > balance){
            return "Insuffecient balance!";
        }
        else{
            balance -= withdrawAmount;
            return "You withdrawed " + withdrawAmount +"$. " + " Balance now is: "+ balance + "$."; 
        }
    }

    public String deposit(int depositAmount){
        balance += depositAmount;
        return "Deposit successful!!";
    }

}