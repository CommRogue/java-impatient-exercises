package ch06;

import java.util.ArrayList;

public class Q6 {
    public static <T> void appendToArray(ArrayList<T> arr1, ArrayList<? extends T> arr2) {
        for (T element : arr2) {
            arr1.add(element);
        }
    }
    public static <T> void appendToArray2(ArrayList<? super T> arr1, ArrayList<T> arr2) {
        for(T element : arr2) {
            arr1.add(element);
        }
    }
}
