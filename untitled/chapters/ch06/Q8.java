package ch06;

class Pair2<E extends Comparable<E>> {
    private final E e1;
    private final E e2;
    public Pair2(E e1, E e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public E getE1() {
        return e1;
    }
    public E getE2() {
        return e2;
    }
    public E getMax() {
        return e1.compareTo(e2) >= 0 ? e1 : e2;
    }
    public E getMin() {
        return getMax() == e1 ? e2 : e1;
    }
    public String toString() {
        return "First: "+e1+"\nSecond: "+e2;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Pair2<Integer> pair = new Pair2<>(1,2);
        System.out.println(pair.getMin());
    }
}
