
public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    // Метод для отримання першого елемента з черги
    public T peek() {
        if (size == 0) {
            return null;
        }
        return head.data;
    }

    // Метод для отримання та видалення першого елемента з черги
    public T poll() {
        if (size == 0) {
            return null;
        }
        T value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }
}

