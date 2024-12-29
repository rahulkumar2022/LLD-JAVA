package BuildHashMap;

import java.util.Hashtable;

public class MyHashMap<K,V> {
    private static final int INITIAL_SIZE = 1<<4;
    private static final int MAXIMUN_SIZE = 1<<32;

    public Entry[] hashTable;
    public MyHashMap(){
        hashTable = new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int size){
        int capacity = findCapacity(size);
        hashTable = new Entry[capacity];
    }

    private int findCapacity(int size){
        if(size >= MAXIMUN_SIZE){
            return MAXIMUN_SIZE;
        }
        int capacity = 1;
        while(capacity < size){
            capacity <<= 1;
        }
        return capacity;
    }

    public static class Entry<K,V>{
        public K key;
        public V value;
        public Entry next;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

        }
    
        public void put(K key, V value){
            int hashCode = key.hashCode() % hashTable.length;
            Entry node = hashTable[hashCode];
            if(node == null){
                Entry entry = new Entry(key, value);
                hashTable[hashCode] = entry;
            }else{
                Entry prevNode = node;
                while(node!= null){
                    if(node.key.equals(key)){
                        node.value = value;
                        return;
                    }
                    prevNode = node;
                    node = node.next;
                }
                Entry newEntry = new Entry(key, value);
                prevNode.next = newEntry;
            }
        }
        public V get(K key){
            int hashCode = key.hashCode() % hashTable.length;

            Entry node = hashTable[hashCode];

            while(node!=null){
                if(node.key.equals(key)){
                    return (V) node.value;
                }
                node = node.next;
            }
            return null;
        }
    }
    
}
