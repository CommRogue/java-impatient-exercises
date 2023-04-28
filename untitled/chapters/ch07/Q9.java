package ch07;

import java.util.HashMap;
import java.util.Map;

public class Q9 {
    public static void main(String[] args) {
        Map<String, Integer> sampleMap = new HashMap<>();
        String s = "sample";
        sampleMap.put(s, 1);
        // contains
        if(!sampleMap.containsKey(s)) {
            sampleMap.put(s, 1);
        }
        else {
            int x = sampleMap.get(s);
            x++;
            sampleMap.put(s, x);
        }

        // get and null
        if(sampleMap.get(s) == null) {
            sampleMap.put(s, 1);
        }
        else {
            int x = sampleMap.get(s);
            x++;
            sampleMap.put(s, x);
        }

        //getOrDefault
        sampleMap.put(s, sampleMap.getOrDefault(s, 0) + 1);

        //putIfAbsent
        if(sampleMap.putIfAbsent(s, 1) != null) {
            sampleMap.put(s, sampleMap.get("sample") + 1);
        }
        System.out.println(sampleMap.get(s));
    }
}
