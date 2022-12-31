import java.util.ArrayList;

public class GraphAdjMatrix implements GraphADT{
    private int[][] adjMatrix;
    private int numNodes;


    public GraphAdjMatrix(int n){
        numNodes = n;
        adjMatrix = new int[n][n];
    }

    public int nNodes() {
        return numNodes;
    }
    public int nEdges() {
        int total = 0;
        for (int i = 0; i < numNodes; i++){
            for (int j = 0; j < numNodes; j++){
                if (isEdge(i, j))
                    total += 1;
            }
        }
        return total;
    }

    public boolean addEdge(int node1, int node2) {
        if (isEdge(node1, node2))
            return false;
        adjMatrix[node1][node2] = 1;
        adjMatrix[node2][node1] = 1;
        return true;
    }

    public boolean isEdge(int node1, int node2) {
        if (adjMatrix[node1][node2] == 1 || adjMatrix[node2][node1] == 1)
            return true;
        return false;
    }

    public ArrayList<Integer> neighbours(int node) {
        ArrayList<Integer> predecessorNodes = new ArrayList<Integer>();
        for (int i = 0; i < nNodes(); i++){
            if (adjMatrix[i][node] == 1 || adjMatrix[node][i] == 1)
                predecessorNodes.add(i);
        }
        return predecessorNodes;
    }

    public int degree(int node) {
        return neighbours(node).size();
    }
}
