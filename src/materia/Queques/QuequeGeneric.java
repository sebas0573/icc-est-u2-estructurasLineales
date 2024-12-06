package materia.Queques;

import java.util.NoSuchElementException;

import materia.models.Node;
import materia.models.NodeGeneric;

public class QuequeGeneric<T> {
    private NodeGeneric<T> front;
    private NodeGeneric<T> rear;

    public QuequeGeneric() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T value){
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
        }else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public NodeGeneric<T> dequeque(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        NodeGeneric<T> node = front;
        front = front.getNext();
        if(front == null){
            rear = null;
        }
        return node;
    }

    public NodeGeneric<T> peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public int getSize(){
        int contador = 0;
        NodeGeneric<T> rear = front;
        while(rear != null){
            System.out.print(rear.getValue() + " ");
            contador++;
            rear = rear.getNext();
        }
        return contador;
    }

    public void printQueuqe(){
        NodeGeneric<T> rear = front;
        while(rear != null){
            System.out.print(rear.getValue() + " ");
            rear = rear.getNext();
        }
    }

    public NodeGeneric<T> deQueque() {
        if(isEmpty()){
            throw new IllegalStateException("La pila esta vacia.");
        }
        NodeGeneric<T> value = front;
        front = front.getNext();
        if(front == null){
            rear = null;
        }
        return value;

    }
    
}
