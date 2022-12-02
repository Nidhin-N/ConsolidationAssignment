import java.util.ArrayList;

public class GraphNoDi implements GraphADT{
    public int nNodes() {
        return 0;
    }

    public int nEdges() {
        return 0;
    }

    public boolean addEdge(int node1, int node2) {
        return false;
    }

    public boolean isEdge(int node1, int node2) {
        return false;
    }

    public ArrayList<Integer> neighbours(int node) {
        return null;
    }

    public int degree(int node) {
        return 0;
    }
}
