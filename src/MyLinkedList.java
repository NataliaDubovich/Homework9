import java.util.Objects;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public T get(int index){
        Objects.checkIndex(index, size);
Node <T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
            
        }
        return current.element;
    }

    static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(T element) {
            this.element = element;
        }
    }
    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        size--;
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    public int size() {
        return size;
    }
}