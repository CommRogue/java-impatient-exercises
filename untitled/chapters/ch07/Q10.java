package ch07;

import java.util.*;

public class Q10 {
    static private class Node implements Comparable<Node> {
        public String name;
        public int distance = Integer.MAX_VALUE;
        public HashSet<Neighbor> neighbors = new HashSet<>();
        public List<String> steps = new ArrayList<>();
        public Node(String name, Object... n) throws IllegalArgumentException {
            if(n.length % 2 != 0) throw new IllegalArgumentException("Invalid neighbor count.");

            this.name = name;
            for(int i = 0; i < n.length; i += 2) {
                String neighborName = (String) n[i];
                int neighborDistance = (int) n[i+1];
                neighbors.add(new Neighbor(neighborName, neighborDistance));
            }
        }
        @Override
        public int compareTo(Node o) {
            return this.distance - o.distance;
        }
    }

    static private class Neighbor {
        String name;
        int distanceTo;
        public Neighbor(String name, int distanceTo) {
            this.name = name;
            this.distanceTo = distanceTo;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Node> allNodes = new HashMap<>();

        System.out.println("Which node is start?");
        String startNode = new Scanner(System.in).nextLine().trim().toUpperCase();
        try {
            allNodes.put("A", new Node("A", "B", 3, "C", 2));
            allNodes.put("B", new Node("B", "F", 1, "E", 2));
            allNodes.put("C", new Node("C", "D", 1, "B", 0));
            allNodes.put("D", new Node("D", "G", 2));
            allNodes.put("E", new Node("E", "G", 2));
            allNodes.put("F", new Node("F"));
            allNodes.put("G", new Node("G"));

        }
        catch(IllegalArgumentException e) {
            System.out.println("Invalid arguments.");
            return;
        }
        if(allNodes.get(startNode) == null) {
            System.out.println("Starting node not found.");
            return;
        }

        Node currNode = allNodes.get(startNode);
        currNode.distance = 0;
        PriorityQueue<Node> unvisited = new PriorityQueue<>(allNodes.values());

        while((currNode = unvisited.poll()) != null) {
            if(currNode.distance == Integer.MAX_VALUE) {
                System.out.println("Failed to reach node "+currNode.name);
                continue;
            }
            for(Neighbor neighbor : currNode.neighbors) {
                int newDistance = currNode.distance + neighbor.distanceTo;
                Node neighborNode = allNodes.get(neighbor.name);
                if(newDistance < neighborNode.distance) {
                    boolean temp = unvisited.remove(neighborNode);
                    neighborNode.distance = newDistance;
                    neighborNode.steps.retainAll(new ArrayList<String>());
                    neighborNode.steps.addAll(currNode.steps);
                    neighborNode.steps.add(currNode.name+" -> "+neighborNode.name);
                    if(temp)
                        unvisited.add(neighborNode);
                }
            }
        }
        System.out.println("Finished.");
        for (Node node : allNodes.values()) {
            System.out.println(node.name +" "+node.distance+" "+(node.steps));
        }
    }
}