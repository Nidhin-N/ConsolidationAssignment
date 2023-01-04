import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class TraversalApp {
    public static void main(String[] args) {
        boolean quit = false;
        try {
            Scanner scanner = new Scanner(Paths.get("Edges.txt"));
            while (scanner.hasNext()){
                int node1 = scanner.nextInt();
                int node2 = scanner.nextInt();
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        Scanner choice = new Scanner(System.in);
        while (quit != true) {
            System.out.println("Choose traversal option: ");
            System.out.println("1: Breadth-First Traversal");
            System.out.println("2: Depth-First Traversal");
            System.out.println("3: Quit Application");
            int option = choice.nextInt();
            switch(option){
                case 1: //breadth-first
                    System.out.println("Enter: ");
                    int BFstart = choice.nextInt();
                    BF(BFstart);
                    break;
                case 2: //depth-first
                    System.out.println("Enter: ");
                    int DFstart = choice.nextInt();
                    DF(DFstart);
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

    public static void BF(int node){
        System.out.println(node);
    }
    public static void DF(int node){
        System.out.println(node);
    }
}
