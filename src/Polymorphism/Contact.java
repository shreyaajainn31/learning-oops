package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Contact {
       
    private List<Person>list = new ArrayList<>();
    public void addContact(String name){
        Person person = new Person();
        person.setName(name);
        list.add(person);
    }

    public void addContact(String name, int phone, String email){
        Person person = new Person();
        person.setEmail(email);
        person.setName(name);
        person.setPhoneNumber(phone);
        list.add(person);
    }

    public void addContact(String name, int phone){
        Person person = new Person();
        person.setName(name);
        person.setPhoneNumber(phone);
        list.add(person);
    }

    public void getContacts(){
        for(Person person : list){
            System.out.println(person);
        }
    }
}
