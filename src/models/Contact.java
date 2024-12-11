package models;


import materia.models.NodeGeneric;

public class Contact <T,U>{

    private T name;
    private U phone;
    public Contact(T name, U phone){
        this.name = name;
        this.phone = phone;
    }
    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }
    public U getPhone() {
        return phone;
    }
    public void setPhone(U phone) {
        this.phone = phone;
    }
    @Override
    public String toString(){
        return "Nombre" + name + "Telefono " + phone;
    }
    
    /*private T name;
    private NodeGeneric<T> next;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public NodeGeneric<T> getNext() {
        return next;
    }

    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    }

    public void NodeGeneric(T value){
        this.name = value;
        this.next = null;
        
    }*/
    
}
