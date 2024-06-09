import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
public class Main {
        public static void main(String[] args) {
//        String [] elements = {"first", "second", "third"};
            MyArrayList myArrayList = new MyArrayList();
//        myArrayList.listArray(elements);
            myArrayList.add("first");
            myArrayList.add("second");
            myArrayList.add("third");
            System.out.println(myArrayList);
            System.out.println("-----------");
            System.out.println(myArrayList.get(0));
            System.out.println(myArrayList.get(1));
            System.out.println(myArrayList.get(2));
            System.out.println("Size: " + myArrayList.size());
            System.out.println("Element at index 1: " + myArrayList.get(1));
            myArrayList.remove(1);
            System.out.println("Size after removal: " + myArrayList.size());
            System.out.println("Element at index 1 after removal: " + myArrayList.get(1));
            myArrayList.clear();
            System.out.println("Size after clear: " + myArrayList.size());
            System.out.println("-----------");
MyLinkedList <String> myLinkedList = new MyLinkedList<>();
            myLinkedList.add("Hello");
            myLinkedList.add("from");
            myLinkedList.add("Linked");
            myLinkedList.add("List");

            System.out.println(myLinkedList.get(0));
            System.out.println(myLinkedList.get(1));
            System.out.println(myLinkedList.get(2));
            System.out.println(myLinkedList.get(3));

            System.out.println("Size: " + myLinkedList.size());
            System.out.println("Element at index 1: " + myLinkedList.get(1));
            myLinkedList.remove(1);
            System.out.println("Size after removal: " + myLinkedList.size());
            System.out.println("Element at index 1 after removal: " + myLinkedList.get(1));
            myLinkedList.clear();
            System.out.println("Size after clear: " + myLinkedList.size());
            System.out.println("-----------");

            MyQueue<String> myQueue = new MyQueue<>();
            myQueue.add("Element 1");
            myQueue.add("Element 2");
            myQueue.add("Element 3");

            System.out.println("Size: " + myQueue.size());
            System.out.println("Peek: " + myQueue.peek());
            System.out.println("Poll: " + myQueue.poll());
            System.out.println("Size after poll: " + myQueue.size());
            System.out.println("Peek after poll: " + myQueue.peek());
            myQueue.clear();
            System.out.println("Size after clear: " + myQueue.size());
            System.out.println("-----------");

            MyStack<String> myStack = new MyStack<>();
            myStack.push("Berry");
            myStack.push("Cherry");
            myStack.push("Strawberry");

            System.out.println("Size: " + myStack.size());
            System.out.println("Peek: " + myStack.peek());
            System.out.println("Pop: " + myStack.pop());
            System.out.println("Size after pop: " + myStack.size());
            System.out.println("Peek after pop: " + myStack.peek());
            myStack.remove(0);
            System.out.println("Size after remove: " + myStack.size());
            System.out.println("Peek after remove: " + myStack.peek());
            myStack.clear();
            System.out.println("Size after clear: " + myStack.size());
            System.out.println("-----------");

            MyHashMap<String, String> myHashMap = new MyHashMap<>();
            myHashMap.put("Hello", "World");
            myHashMap.put("Hey", "Everyone");
            myHashMap.put("Hi", "all");
//            myHashMap.put(null, "Here key is null");


            System.out.println(myHashMap.get("Hello"));
            System.out.println(myHashMap.get("Hey"));
            System.out.println(myHashMap.get("Hi"));
//            System.out.println(myHashMap.get("null"));

            System.out.println("Size: " + myHashMap.size()); // Output: 3
            System.out.println("Value for 'Hey': " + myHashMap.get("Hey")); // Output: 2
            myHashMap.remove("Two");
            System.out.println("Size after removal: " + myHashMap.size()); // Output: 2
            System.out.println("Value for 'Hey' after removal: " + myHashMap.get("Hey")); // Output: null
            myHashMap.clear();
            System.out.println("Size after clear: " + myHashMap.size()); // Output: 0


//            for (Map.Entry<String, String> entry : myHashMap.entrySet()){
//                System.out.println(entry.getKey());
//                System.out.println(entry.getValue());
//                System.out.println("________________________");


            }



        }



