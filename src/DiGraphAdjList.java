import java.util.*;

public class DiGraphAdjList implements DiGraphADT{
    private int numNodes;
    private LinkedList<Integer> adjList[];

    public void DiGraphAdjMatrix(int n){
        numNodes = n;
        adjList = new LinkedList[n];
        for (int i = 0; i < n; n++){
            adjList[i] = new LinkedList<>();
        }
    }

    public int nNodes() {
        return numNodes;
    }

    public int nEdges() {
        return 0;
    }

    public boolean addEdge(int node1, int node2) {
        if (isEdge(node1, node2))
            return false;
        adjList[node1].addFirst(node2);
        adjList[node2].addFirst(node1);
        return true;
    }

    public boolean isEdge(int node1, int node2) {
        return false;
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
