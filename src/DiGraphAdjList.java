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
        if (isEdge(node1, node2))
            return false;
        adjList.get(node1).add(node2);
        return true;
    }

    public boolean isEdge(int node1, int node2) {
        int i = 0;
        boolean found = false;
        while (!found && i<nEdges()){
                if ((adjList.get(node1) != null) && (adjList.get(node1).contains(node2)))
                    found = true;
                else
                    i++;
        }
        return found;
    }

    public ArrayList<Integer> successors(int node) {
        ArrayList<Integer> successorNodes = new ArrayList<Integer>();
        if (adjList.get(node) != null)
            for (int i = 0; i < adjList.get(node).size(); i++){
                successorNodes.add(adjList.get(node).get(i));
            }
        return successorNodes;
    }

    public ArrayList<Integer> predecessors(int node) {
        ArrayList<Integer> predecessorNodes = new ArrayList<Integer>();
        for (int i=0; i<nNodes(); i++)
            if (adjList.get(i).contains(node))
                predecessorNodes.add(i);
        return predecessorNodes;
    }

    public int outDegree(int node) {
        return adjList.get(node).size();
    }

    public int inDegree(int node) {
        return predecessors(node).size();
    }

}