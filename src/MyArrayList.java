import java.util.Arrays;

public class MyArrayList<T> {
    private T[] elements;
    private int size;

    public MyArrayList() {
        size = 0;
        elements = (T[]) new Object[10];
    }

    public void add(T value) {
        ensureCapacity(size + 1);
        elements[size] = value;
        size++;

    }

    public T get(int index) {

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public int size() {

        return size;
    }

    public void clear() {
        Arrays.fill(elements, 0, size, null);
        size = 0;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
}
