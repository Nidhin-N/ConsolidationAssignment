import java.util.*;

public class DiGraphAdjMatrix implements DiGraphADT {
    private int adjMatrix[][];
    private int numNodes;


    public DiGraphAdjMatrix(int n){
        numNodes = n;
        adjMatrix = new int[n][n];
    }

    public int nNodes() {
        return numNodes;
    }
    public int nEdges() {
        int total = 0;
        for (int i = 0; i < numNodes; i++)
            total += adjMatrix[i].length;
        return total/2;
    }

    public boolean addEdge(int node1, int node2) {
        if (isEdge(node1, node2))
            return false;
        adjMatrix[node1][node2] = 1;
        adjMatrix[node2][node1] = 1;
        return true;
    }

    public boolean isEdge(int node1, int node2) {
        if ((adjMatrix[node1][node2] == 1) && (adjMatrix[node2][node1] == 1))
            return true;
        return false;
    }

    public ArrayList<Integer> successors(int node) {
        ArrayList<Integer> successorNodes = new ArrayList<Integer>();
        for (int i=0; i<nEdges(); i++)
            if (adjMatrix[i][i] == node)
                successorNodes.add(adjMatrix[i][i]);
        return successorNodes;
    }

    public ArrayList<Integer> predecessors(int node) {
        ArrayList<Integer> predecessorNodes = new ArrayList<Integer>();
        for (int i=0; i<nEdges(); i++)
            if (adjMatrix[i][] == node)
                predecessorNodes.add(adjMatrix[i][i]);
        return predecessorNodes;
    }

    public int outDegree(int node) {
        return successors(node).size();
    }

    public int inDegree(int node) {
        return predecessors(node).size();
    }
}
