package ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q3 {
    public static <T> Set<T> intersection(Set<T> arr1, Set<T> arr2) {
        Set<T> arr3 = new HashSet<T>(arr1);
        arr3.retainAll(arr2);
        return arr3;
    }

    public static <T> Set<T> union(Set<T> arr1, Set<T> arr2) {
        Set<T> arr3 = new HashSet<T>(arr1);
        arr3.addAll(arr2);
        return arr3;
    }

    public static <T> Set<T> difference(Set<T> arr1, Set<T> arr2) {
        Set<T> arr3 = new HashSet<T>(arr1);
        arr3.addAll(arr2);
        arr3.removeAll(intersection(arr1, arr2));
        return arr3;
    }

    public static void main(String[] args) {
        HashSet<Integer> g = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        g.add(1);
        g.add(2);
        b.add(2);
        b.add(3);
        Set x = difference(g, b);
        System.out.println(Arrays.toString(x.toArray(new Integer[0])));
    }
}
