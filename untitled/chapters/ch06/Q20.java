package ch06;

import java.io.Serializable;
import java.util.Arrays;

public class Q20 {
    @SafeVarargs public static final <T> T[] repeat(int n, T... arr) {
        System.out.println(arr.getClass().getComponentType());
        T[] newArr = (T[]) java.lang.reflect.Array.newInstance(arr.getClass().getComponentType(), n*(arr.length));
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < n; j++) {
                newArr[(i*n)+j] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        //reflection works in the above method because varargs are computed to
        // String array, and it is passed to T... (which gets erased to Object[]).
        // Because a String array was passed, reflection will get the class of it
        // even when it's erased to Object[]
        System.out.println(Arrays.toString(repeat(5, "new", "s")));

    }
}
