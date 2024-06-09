import java.util.Arrays;
   public class MyArrayList<T> {
       private Object[] elements;
       private int size;

       public MyArrayList() {
           elements = new Object[10];
           size = 0;
       }

       public void add(T value) {
           elements[size] = value;
           size++;

       }

       public T get(int index) {

           return (T) elements[index];
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
   }
