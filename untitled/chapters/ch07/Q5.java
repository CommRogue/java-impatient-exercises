package ch07;

import java.util.*;

public class Q5 {
    public static void swap(List<?> list, int i, int j) {
        _swap(list, i , j);
    }
    private static <T> void _swap(List<T> list, int i, int j) {
        Objects.requireNonNull(list);
        if(list instanceof RandomAccess) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        else {
            // if i > j - i then iterate to i, then iterate from i to j, and then go back to i, and then switch between them
            // if j - i > i then iterate to i, then iterate from start to j, and switch between them

            ListIterator<T> iter = list.listIterator(i);
            T e1 = iter.next();

            if (i > j - i) {
                T x;
                for(int curr = i; curr < j-1; curr++) {
                    x = iter.next();
                }
                T e2 = iter.next();
                iter.set(e1);
                for(int curr = j; curr >= i; curr--) {
                    iter.previous();
                }
                iter.set(e2);
            }
            else {
                ListIterator<T> subIterator = list.listIterator(j);
                T e2 = subIterator.next();
                iter.set(e2);
                subIterator.set(e1);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(0);
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        swap(x, 1, 5);
        System.out.println(Arrays.toString(x.toArray()));
    }
}
