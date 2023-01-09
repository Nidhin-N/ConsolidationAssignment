
import java.util.*;

public class DiGraphAdjList implements DiGraphADT{
    private int numNodes;
    private ArrayList<ArrayList<Integer>> adjList;


    public DiGraphAdjList(int n){
        numNodes = n;
        adjList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < nNodes(); i++){
            adjList.add(new ArrayList<Integer>());
        }
    }

    public int nNodes() {
        return numNodes;
    }

    public int nEdges() {
         int edges = 0;
         for (int i = 0; i < nNodes(); i++){
             edges += adjList.get(i).size();
         }
         return edges;
    }

    public boolean addEdge(int node1, int node2) {
        //if (isEdge(node1, node2))
            //return false;
        adjList.get(node1).add(node2);
        return true;
    }

    public boolean isEdge(int node1, int node2) {
        int i = 0;
        boolean found = false;
        while (!found && i<nEdges())
        {
            if ((adjList == node1) && (adjList.get(i).get(i) == node2))
                found = true;
            else
                i++;
        }
        return true;
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
