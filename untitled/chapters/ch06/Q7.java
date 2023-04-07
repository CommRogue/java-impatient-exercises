package ch06;

class Pair<E> {
    private final E e1;
    private final E e2;
    public Pair(E e1, E e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public E getE1() {
        return e1;
    }
    public E getE2() {
        return e2;
    }
    public String toString() {
        return "First: "+e1+"\nSecond: "+e2;
    }
}

public class Q7 {

}
