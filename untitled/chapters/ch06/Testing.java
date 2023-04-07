package ch06;

import java.util.ArrayList;

//class A implements Comparable<A> {
//    String g;
//    public A(String a) {
//        g = a;
//    }
//    @Override
//    public int compareTo(A o) {
//        return g.length()-o.g.length();
//    }
//}

public class Testing {
    public static void main(String[] args) {
//        Table3<A, Integer> table = new Table3<>();
//
//        A a1 = new A("Guy");
//        A a2 = new A("Jos");
//
//        table.put(a1, 3);
//        System.out.println(table.get(a2));
    }
}

class Table3<K, V> {
    private ArrayList<Entry3<K, V>> table = new ArrayList<>();

    public void put (K key, V value) {
        for (Entry3<K, V> entry : table) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        table.add(new Entry3<>(key, value));
    }

    public V get (K key) {
        for (Entry3<K, V> entry : table) {
            if (entry.key == key) {
                return entry.value;
            }
        }

        return null;
    }

    public void remove(K key) {
        for (Entry3<K, V> entry : table) {
            if (entry.key == key) {
                table.remove(entry);
                return;
            }
        }
    }
}

class Entry3<K, V> {
    K key;
    V value;

    Entry3 (K key, V value) {
        this.key = key;
        this.value = value;
    }
}