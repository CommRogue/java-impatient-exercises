package ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Q15 {
    public static <T, R> ArrayList<R> map(ArrayList<T> arr, Function<T, R> func) {
        ArrayList<R> returnList = new ArrayList<>();
        for(T elem : arr) {
            returnList.add(func.apply(elem));
        }
        return returnList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(3);
        arrList = map(arrList, a -> a*5);
        System.out.println(Arrays.toString(arrList.toArray(Integer[]::new)));
    }
}
