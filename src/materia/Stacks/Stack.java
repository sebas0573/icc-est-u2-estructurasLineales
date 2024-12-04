package materia.Stacks;

import java.util.EmptyStackException;

import materia.models.Node;

public class Stack {
    
    private Node top;//Nodo en la cima de nuestra pila
    //private int size;

    //creamos la pila con la cima nula o vacia
    public Stack(){
        this.top = null;
        //this.size = 0;
    }

    public void push(int value){

        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        //size++;
    }

    //metodo que retira el nodo de la cima.
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        //size--;
        return value;
    }

    //metodo que retorna el valor del nodo de la cima.
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        Node current = top;
        while(current != null){
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
    }

    //complejidad O(n)
    public int getSize(){
        int contador = 0;
        Node current = top;
        while(current != null){
            System.out.print(current.getValue() + " ");
            contador++;
            current = current.getNext();
        }
        return contador;
    }
    //complejidad O(1)
    /*public int getSize(){
        return size;
    }*/
}
