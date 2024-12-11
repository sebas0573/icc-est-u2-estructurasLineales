package materia.models;

public class Node {

    private int value;
    public Node next;
    public Object contact;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    
    
}
