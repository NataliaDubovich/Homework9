
    public class MyStack<T> {
        private Node<T> top;
        private int size;
         static class Node<T> {
            T data;
            Node<T> next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        // Метод для додавання елемента в стек
        public void push(T value) {
            Node<T> newNode = new Node<>(value);
            newNode.next = top;
            top = newNode;
            size++;
        }
        public void remove(int index) {
            if (index >= size || index < 0) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            if (index == 0) {
                top = top.next;
            } else {
                Node<T> current = top;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
            size--;
        }
        public void clear() {
            top = null;
            size = 0;
        }
        public int size() {
            return size;
        }

        public T peek() {
            if (size == 0) {
                return null;
            }
            return top.data;
        }
        public T pop() {
            if (size == 0) {
                return null;
            }
            T value = top.data;
            top = top.next;
            size--;
            return value;
        }
    }

