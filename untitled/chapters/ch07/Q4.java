package ch07;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        x.add("ew");
        x.add("xz");
        x.add("xz");
        x.add("xz");
        x.add("xz");

        ListIterator<String> iter = x.listIterator();
        while(iter.hasNext()) {
            String s = iter.next();
            x.remove(s); // do not remove current iterator element or future elements
                         // while using the iterator. preferably use only iterator
                         //  methods to modify container.
        }
    }
}
