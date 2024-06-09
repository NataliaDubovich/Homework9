
   public class MyArrayList<T>{
        private int size;
        private T[] elements = (T[])new Object();
        //    public <E> void listArray(E[] elements){
//        for (E element: elements){
//            System.out.println(element);
//        }
//    }
        public void add (T value){
            elements[size] = value;
            size++;

        }
        public T get(int index){

            return (T)elements[index];
        }
    }
}
