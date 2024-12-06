package materia.Queques;

import materia.models.Node;

public class Queque {
    private Node front; //nodo al frente de la cola
    private Node rear; //nodo al final de la cola

    //creamos una cola con nodos vacios
    public Queque() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
        }else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public boolean isEmpty(){
        return front == null;
    }


    public Node getFront() {
        return front;
    }
    public void setFront(Node front) {
        this.front = front;
    }
    public Node getRear() {
        return rear;
    }
    public void setRear(Node rear) {
        this.rear = rear;
    }


    
}
