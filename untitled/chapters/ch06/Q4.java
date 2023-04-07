package ch06;

import java.util.ArrayList;

class Table2<K extends Comparable<K> , V> {
    class Entry2 {
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
        public Entry2(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public Entry2(K key) {
            this(key, null);
        }
    }
    private final ArrayList<Entry2> arrList;
    public Table2() {
        arrList = new ArrayList<>();
    }
    public void setKey(K key, V value) {
        arrList.add(new Entry2(key, value));
    }
    public V getValue(K key) {
        for(Entry2 entry : arrList) {
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

class A implements Comparable<A> {
    String g;
    public A(String a) {
        g = a;
    }
    @Override
    public int compareTo(A o) {
        return g.length()-o.g.length();
    }
}
public class Q4 {
    public static void main(String[] args) {
        Table2<A, Integer> table = new Table2<>();
        table.setKey(new A("Guy"), 5);
        System.out.println(table.getValue(new A("Jos3")));
    }
}