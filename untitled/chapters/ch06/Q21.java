package ch06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Q21 {
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public static <T> T[] construct(int s, T... pArr) {
        return (T[])Array.newInstance(pArr.getClass().getComponentType(), s);
    }
    public static <R> R createArray(int s, Function<Integer, R> func) {
        return func.apply(s);
    }

    public static void main(String[] args) {
        String[] sQ = Q21.createArray(5, String[]::new);
        System.out.println(Arrays.toString(sQ));
    }
}
