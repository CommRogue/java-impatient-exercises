package ch06;

import java.sql.Array;
import java.util.ArrayList;


class Arrays {
    public static <T> Pair<T> firstLast(ArrayList<? extends T> arr) {
        return new Pair<>(arr.get(0), arr.get(arr.size()-1));
    }
}

class X {

}

class Y extends X {

}

public class Q9 {
    public static void main(String[] args) {
        ArrayList<Y> arrayList = new ArrayList<>();
        arrayList.add(new Y());
        arrayList.add(new Y());
        arrayList.add(new Y());
        System.out.println(Arrays.<X>firstLast(arrayList));
    }
}
