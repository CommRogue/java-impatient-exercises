package ch06;

import java.util.ArrayList;

class Entry <K, V> {
    private final K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public Entry(K key) {
        this(key, null);
    }
}
class Table <K extends Comparable<K> , V> {
    private final ArrayList<Entry<K, V>> arrList;
    public Table() {
        arrList = new ArrayList<>();
    }
    public void setKey(K key, V value) {
        arrList.add(new Entry<>(key, value));
    }
    public V getValue(K key) {
        for(Entry<K, V> entry : arrList) {
            if(entry.getKey().compareTo(key) == 0) {
                return entry.getValue();
            }
        }
        return null;
    }
    public void removeKey(K key) {
        for(int i = 0; i < arrList.size(); i++) {
            if(arrList.get(i).getKey().compareTo(key) == 0) {
                arrList.remove(i);
                break;
            }
        }
    }
}


public class Q3{
    public static void main(String[] args) {
        Table2<Integer, Integer> table = new Table2<>();
        table.setKey(3, 5);
        System.out.println(table.getValue(3));
    }
}