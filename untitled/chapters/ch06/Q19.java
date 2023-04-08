package ch06;

import java.util.ArrayList;

public class Q19 {
    public static <T> T[] repeat(int n, T obj) {
        ArrayList<T> arrList = new ArrayList<>();
        T[] s = (T[]) arrList.toArray();
        return s;
    }

    public static void main(String[] args) {
        String n = "ew";
        Object x = (Object)n;

    }
}
