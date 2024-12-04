package materia.models;

public class Node {

    private int value;
    private Node next;

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

    public Node(int value) {
        this.value = value;
    }

    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
    
}
