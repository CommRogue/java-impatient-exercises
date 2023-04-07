package ch06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q12to13 {
    public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
        T min = elements.get(0), max = elements.get(0);
        T cElement;
        for (int i = 1; i < elements.size(); i++) {
            cElement = elements.get(i);
            if (comp.compare(cElement, max) > 0) {
                max = cElement;
            }
            else if (comp.compare(cElement, min) < 0) {
                min = cElement;
            }
        }
        result.add(min);
        result.add(max);
    }
    public static <T> void swapHelper(List<T> arr, int i1, int i2) {
        T obj = arr.get(i1);
        arr.set(i1, arr.get(i2));
        arr.set(i2, obj);
    }
    public static void swap(List<?> arr, int i1, int i2) {
        swapHelper(arr, i1, i2);
    }
    public static <T> void maxmin(List<T> elements,
                                  Comparator<? super T> comp, List<? super T> result) {
        minmax(elements, comp, result);
        Q12to13.swapHelper(result, 0, 1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(13);
        arrayList.add(-1);
        arrayList.add(2);
        ArrayList<Integer> resultList = new ArrayList<>();
        maxmin(arrayList, (a, b) -> a-b, resultList);
        System.out.println(resultList.get(0)+" "+resultList.get(1));
    }
}
