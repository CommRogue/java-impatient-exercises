package ch07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Q8 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./chapters/ch07/bruhmomento.txt");
        Scanner scanner = new Scanner(file);
        HashMap<String, Set<Integer>> map = new HashMap<>();

        for(int line = 1; scanner.hasNext(); line++) {
            String text = scanner.nextLine();
            String[] words = text.split(" ");
            for(String word : words) {
                map.merge(word, new HashSet<>(Arrays.asList(line)), (a, b) -> {
                    a.addAll(b);
                    return a;
                });
            }
        }

        for(Map.Entry<String, Set<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }
}
