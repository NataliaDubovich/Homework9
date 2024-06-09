public class MyHashMap<K, V> {
    private static final int DEFAULT_SIZE=8;
private Entry <K, V> [] context = new Entry[DEFAULT_SIZE];
private int size;

public void put (K key, V value){
    int index = calculateIndex(key.hashCode());
    Entry <K, V> newEntry = new Entry<>(key, value);
    if (context[index] == null){
        context[index] = newEntry;
    }else{
//iterate index list save as last
    }
}
    // Метод для видалення пари за ключем
    public void remove(K key) {
//        int index = indexFor(hash(key));
        int index = calculateIndex(key.hashCode());
        Entry<K, V> prev = null;
        Entry<K, V> node = context[index];
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    context[index] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return;
            }
            prev = node;
            node = node.next;
        }
    }

public V get(K key){
    int index = calculateIndex(key.hashCode());
    if (context[index].key.equals(key)){
return context[index].value;
    }else{
        //iterate index list and compare with equals
        context[index] =  context[index].next;
    }
    return null;
}
private int calculateIndex(int hashCode){
    return Math.abs(hashCode% context.length);
}
static class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;

    }
}
    public void clear() {
        context = new Entry[DEFAULT_SIZE];
        size = 0;
    }

    // Метод для отримання розміру колекції
    public int size() {
        return size;
    }

}

