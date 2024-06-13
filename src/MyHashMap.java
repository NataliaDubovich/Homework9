public class MyHashMap<K, V> {
    private static final int DEFAULT_SIZE = 8;
    private Entry<K, V>[] context = new Entry[DEFAULT_SIZE];
    private Entry<K, V> nullEntry;
    private int size;

    public void put(K key, V value) {
        if (key == null) {
            if (nullEntry == null) {
                nullEntry = new Entry<>(null, value);
                size++;
            } else {
                nullEntry.value = value;
            }
            return;
        }
        int index = calculateIndex(key.hashCode());
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (context[index] == null) {
            context[index] = newEntry;
            size++;
        } else {
            Entry<K, V> current = context[index];
            while (true) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                if (current.next == null) {
                    current.next = newEntry;
                    size++;
                    return;
                }
                current = current.next;
            }
        }
    }

    public void remove(K key) {
        if (key == null) {
            if (nullEntry != null) {
                nullEntry = null;
                size--;
            }
            return;
        }
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

    public V get(K key) {
        if (key == null) {
            return nullEntry == null ? null : nullEntry.value;
        }
        int index = calculateIndex(key.hashCode());
        Entry<K, V> current = context[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    private int calculateIndex(int hashCode) {
        return Math.abs(hashCode % context.length);
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
        nullEntry = null;
        size = 0;
    }

    public int size() {
        return size;
    }

}

