package Polymorphism;

public class Person {
    private String name;
    private int phoneNumber;
    private String email;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public String toString() {
        return this.name + " " + this.phoneNumber + " " + this.email;
     }
    
}
