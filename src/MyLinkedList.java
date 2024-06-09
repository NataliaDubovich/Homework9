import org.w3c.dom.Node;

public class LinkedList<T> {
    private Node <T> head;
    private Node <T> tail;
    private int size;
    public void add (T element){
        Node<T> newNode = new Node<>(element);
        if (head == null){
            head = tail = newNode;
        }
    }
static class Node<T>{
        T element;
        Node<T> next;
        Node<T> prev;
}
public Node(T element){
        this.element = element;
}
}
