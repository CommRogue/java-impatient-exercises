package ch07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Q2 {
    public static ArrayList<String> toUpper1(ArrayList<String> arr) {
        ListIterator<String> iter = arr.listIterator();
        String curr;
        while(iter.hasNext()) {
            curr = iter.next();
            iter.set(curr.toUpperCase());
        }
        return arr;
    }

    public static ArrayList<String> toUpper2(ArrayList<String> arr) {
        for(int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i).toUpperCase());
        }
        return arr;
    }

    public static ArrayList<String> toUpper3(ArrayList<String> arr) {
        arr.replaceAll(String::toUpperCase);
        return arr;
    }

    public static void main(String[] args) {

    }
}
