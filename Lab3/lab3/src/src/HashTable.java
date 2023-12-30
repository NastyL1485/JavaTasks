package src;

import java.util.LinkedList;

public class HashTable<K, V> {
    private LinkedList<Entry<K, V>>[] table;
    protected int size;
    private int elements;
    public HashTable(int size){
        this.size = size;
        this.table = new LinkedList[this.size];
        this.elements = 0;
    }
    public HashTable(){
        this(10);
    }
    private int hash(K key){
        return key.hashCode() % this.size;
    }

    public void put(K key, V value){
        int index = hash(key);
        if (table[index] == null){
            table[index] = new LinkedList<Entry<K, V>>();
        }
        for(Entry<K, V> elem: table[index]){
            if (elem.getKey().equals(key)){
                elem.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<K, V>(key, value));
        this.elements++;
    }
    public V get(K key){
        int index = hash(key);
        LinkedList<Entry<K, V>> list = table[index];
        if (list != null){
            for (Entry<K, V> elem: list){
                if (elem.getKey().equals(key)){
                    return elem.getValue();
                }
            }
        }
        return null;
    }
    public void remove(K key){
        int index = hash(key);
        LinkedList<Entry<K, V>> list = table[index];
        if (list != null){
            for (Entry<K, V> elem: list){
                if (elem.getKey().equals(key)){
                    list.remove(elem);
                    this.elements--;
                }
            }
        }
    }

    public int size(){
        return this.elements;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }
}