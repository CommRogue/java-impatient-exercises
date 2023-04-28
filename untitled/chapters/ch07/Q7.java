package ch07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q7 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./chapters/ch07/bruhmomento.txt");
        Scanner scanner = new Scanner(file);
        TreeMap<String, Integer> map = new TreeMap<>();
        while(scanner.hasNext()) {
            String word = scanner.next();
            map.merge(word, 1, Integer::sum);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }
}
