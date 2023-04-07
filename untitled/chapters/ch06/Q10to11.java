package ch06;

import java.util.ArrayList;

class Arrays2 {
    public static <T> Pair<T> firstLast(ArrayList<? extends T> arr) {
        return new Pair<>(arr.get(0), arr.get(arr.size()-1));
    }
//    public static <T extends Comparable<T>, K extends T> T min(ArrayList<K> arr) {
//        T min;
//        for()
//    }
    public static <T extends Comparable<T>> T min(ArrayList<T> arr) {
        if(arr.size() > 0) {
            T min = arr.get(0);
            for(int i = 1; i < arr.size(); i++) {
                if(min.compareTo(arr.get(i)) > 0) {
                    min = arr.get(i);
                }
            }
            return min;
        }
        else {
            return null;
        }
    }
    public static <T extends Comparable<T>> T max(ArrayList<T> arr) {
        if(arr.size() > 0) {
            T max = arr.get(0);
            for(int i = 1; i < arr.size(); i++) {
                if(max.compareTo(arr.get(i)) < 0) {
                    max = arr.get(i);
                }
            }
            return max;
        }
        else {
            return null;
        }
    }
    public static <T extends Comparable<T>> Pair<T> minMax(ArrayList<T> arr) {
        return new Pair<T>(min(arr), max(arr));
    }
}
public class Q10to11 {
    public static void main(String[] args) {
        ArrayList<Integer> sa = new ArrayList<>();
        sa.add(5);
        sa.add(3);
        System.out.println(Arrays2.minMax(sa));
    }
}
