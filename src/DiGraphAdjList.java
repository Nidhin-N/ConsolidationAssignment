
import java.util.*;

public class DiGraphAdjList implements DiGraphADT{
    private int numNodes;
    ArrayList<Node>adjList;
    class Node{
        int node1, node2;
        ArrayList<Node> neighbours;

        Node(int node1, int node2){
            this.node1 = node1;
            this.node2 = node2;
            this.neighbours = new ArrayList<>();
        }
    }

    public DiGraphAdjList(int n){
        numNodes = n;
        adjList = new ArrayList<Node>();
    }

    public int nNodes() {
        return numNodes;
    }

    public int nEdges() {
        return adjList.size();
    }

    public boolean addEdge(int node1, int node2) {
        if (isEdge(node1, node2))
            return false;
        Node node = new Node(node1, node2);
        adjList.add(node);
        return true;
    }

    public boolean isEdge(int node1, int node2) {
        int i = 0;
        boolean found = false;
        while (!found && i<nEdges())
        {
            if ((adjList.get(i).node1 == node1) && (adjList.get(i).node2 == node2))
                found = true;
            else
                i++;
        }
        return found;
    }

    public ArrayList<Integer> successors(int node) {
        return null;
    }

    public ArrayList<Integer> predecessors(int node) {
        return null;
    }

    public int outDegree(int node) {
        return 0;
    }

    public int inDegree(int node) {
        return 0;
    }

}
