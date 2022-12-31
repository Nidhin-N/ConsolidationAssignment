/**import java.util.*;

public class DiGraphAdjList implements DiGraphADT{
    private int numNodes;
    private LinkedList<Integer> adjList[];

    public DiGraphAdjList(int n){
        numNodes = n;
        adjList = new LinkedList[n];
        for (int i = 0; i < n; i++){
            adjList[i] = new
        }
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
        adj node = new a (node1, node2);
        node = adjList[node1].head;
        adjList[node1].head = node;
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

}**/
