package controllers;

import java.util.LinkedList;

import materia.models.Node;
import materia.models.NodeGeneric;
import models.Contact;
import models.*;

public class ContactManager {

    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager(){
        this.contacts = new LinkedList<>();
    }
   

    public <T> void addContact(Contact<?, ?> contact){
        
        //contacts.appendToTail(contact);
        //contact.appendToTail(contact);
        //contacts.appendToTail(contact);

    


    }
    public Contact<? ,? > findContactByName(String name){
        NodeGeneric<Contact <?,?>> current = contacts.getHead();
        while (current != null) {
            if (((String) (current.getValue().getName())).equals(name)) {
                return current.getValue();
                
            } 
            current = current.getNext();
            System.out.println(current);
            System.out.println(current.getNext());
            
        }
        return null;// nose encontro un contacto como ese 



    }
    public void deleteContactByName(String name){
        NodeGeneric<String> current = contacts.getHead();
        if(((String) (current.getValue().getName())).equals(name)){
            contacts.setHead(contacts.getHead().getNext());
            contacts.setSize(contacts.getSize()-1);
            return;
            //Caso 1 si el contacto esta en la Head
            //
            while (current.getNext() != null) {
                if (((String) current.getNext().getValue().getName()).equalsIgnoreCase(name)) {
                    current.setNext(current.getNext().getNext());
                    contacts.setSize(contacts.getSize());
                    return;

                    
                } 
                current = current.getNext();
                
            }

        } 


    }
    public void  printList(){


    }
    
}
