package ch07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q6 {
    public static void test(Map<String, ? extends Set<Integer>> set) {

    }
    public static void main(String[] args) {
        HashMap<String, HashSet<Integer>> set = new HashMap<>();
        test(set);
    }
}
