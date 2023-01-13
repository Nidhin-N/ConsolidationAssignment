import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class TraversalApp {
    private GraphADT g;

    public static void main(String[] args) {
        boolean quit = false;
        ArrayList<Integer> nodes = new ArrayList<>(); //helper array to count total of distinct nodes
        try {
            Scanner scanner = new Scanner(Paths.get("Edges.txt")); //scanner to read all distinct elements and get total
            while (scanner.hasNextInt()) {
                int node = scanner.nextInt();
                if (!(nodes.contains(node)))
                    nodes.add(node);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        GraphAdjList g = new GraphAdjList(nodes.size()); //create new Undirected Adjacency List of size of n where n is total of distinct nodes
        try {
            Scanner scanner2 = new Scanner(Paths.get("Edges.txt")); //Scanner to read in nodes and add the edges
            while (scanner2.hasNextInt()) {
                int node1 = scanner2.nextInt();
                int node2 = scanner2.nextInt();
                g.addEdge(node1, node2);
            }
        } catch (IOException e) {
            System.out.println("File not foun d");
        }
        Scanner choice = new Scanner(System.in);
        while (quit != true) {
            System.out.println("Choose traversal option: ");
            System.out.println("1: Breadth-First Traversal");
            System.out.println("2: Depth-First Traversal");
            System.out.println("3: Quit Application");
            int option = choice.nextInt();
            switch (option) {
                case 1: //breadth-first
                    System.out.println("Enter starting node: ");
                    int BFstart = choice.nextInt();
                    BF(g, BFstart);
                    break;
                case 2: //depth-first
                    System.out.println("Enter starting node: ");
                    int DFstart = choice.nextInt();
                    DF(g, DFstart);
                    break;
                case 3:
                    quit = true;
                    System.out.println("Application exited");
                    break;
                default:
                    System.out.println("No option exists. Try again");
            }
        }
    }

    public static void BF(GraphAdjList g, int node) {
        double avgDegree = 0.0;
        boolean[] reached = new boolean[g.nNodes()];
        Queue<Integer> queue = new LinkedList<>();
        reached[node] = true;
        queue.add(node);
        System.out.println("Current node's degree is: " + g.degree(node));
        avgDegree += g.degree(node);

        while (queue.size() != 0){
            node = queue.remove();
            ArrayList<Integer> current = g.neighbours(node);
            for (int i = 0; i < current.size(); i++){
                if (!reached[current.get(i)]){
                    reached[current.get(i)] = true;
                    System.out.println("Current node's number is: "+ current.get(i) + " & current node's degree is: " + g.degree(current.get(i)));
                    avgDegree += g.degree(current.get(i));
                    queue.add(current.get(i));
                }
            }
        }
        System.out.println("\nAverage node degree is: " + avgDegree/g.nNodes() + "\n");
    }


    public static void DF(GraphAdjList g, int node) {
        double avgDegree = 0.0;
        boolean[] reached = new boolean[g.nNodes()];
        Stack<Integer> stack = new Stack<>();
        reached[node] = true;
        stack.push(node);
        System.out.println("Current node's degree is: " + g.degree(node));
        avgDegree += g.degree(node);

        while (stack.size() != 0){
            node = stack.pop();
            ArrayList<Integer> current = g.neighbours(node);
            for (int i = 0; i < current.size(); i++){
                if (!reached[current.get(i)]){
                    reached[current.get(i)] = true;
                    System.out.println("Current node's number is: "+ current.get(i) + " & current node's degree is: " + g.degree(current.get(i)));
                    avgDegree += g.degree(current.get(i));
                    stack.push(current.get(i));
                }
            }
        }
        System.out.println("\nAverage node degree is: " + avgDegree/g.nNodes() + "\n");
    }

}