package controllers;

import java.util.LinkedList;

public class ContactManager {

    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager(){
        this.contacts = new LinkedList<>();
    }
   

    public void addContact(Contact<?, ?> contact){
        //contacts.appendToTail(contact);


    }
    public void  findContactByName(){

    }
    public void deleteContact(){

    }
    
}
