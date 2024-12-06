package materia.Stacks;

import java.util.EmptyStackException;

import materia.models.Node;
import materia.models.NodeGeneric;

public class StackGeneric<T> {

    private NodeGeneric<T> top;//nodo generico
    private int size;//variable tamanio O(1)

    //crea una pila instanciando el nodo top como null y el tamanio en 0
    public StackGeneric(){
        this.top = null;
        this.size = 0;
    }

    //metodo para agregar un elemento a la pila
    public void push(T data){
        NodeGeneric<T> newNode = new NodeGeneric<>(data);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    //metodo para retirar un elemento de la pila
    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("La pila esta vacia.");
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    //metodo que retorna el valor del nodo de la cima.
    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public void printStack(){
        NodeGeneric<T> current = top;
        while(current!= null){
            System.out.print(current.getValue());
            current = current.getNext();
        }
        System.out.println();
    }

    public int getSize(){
        int contador = 0;
        NodeGeneric<T> current = top;
        while(current != null){
            System.out.print(current.getValue() + " ");
            contador++;
            current = current.getNext();
        }
        return contador;
    }

    public NodeGeneric<T> popNode() {
        if(isEmpty()){
            throw new IllegalStateException("La pila esta vacia.");
        }
        NodeGeneric<T> value = top;
        top = top.getNext();
        size--;
        return value;

    }

    
}
