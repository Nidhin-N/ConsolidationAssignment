import java.util.ArrayList;

public class GraphAdjList implements GraphADT{
    private int numNodes;
    private ArrayList<ArrayList<Integer>> adjList;


    public GraphAdjList(int n){
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
        return edges/2;
    }

    public boolean addEdge(int node1, int node2) {
        if (isEdge(node1, node2))
            return false;
        adjList.get(node1).add(node2);
        adjList.get(node2).add(node1);
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

    public ArrayList<Integer> neighbours(int node) {
        ArrayList<Integer> neighbours = new ArrayList<Integer>();
        if (adjList.get(node) != null)
            for (int i = 0; i < adjList.get(node).size(); i++){
                neighbours.add(adjList.get(node).get(i));
            }
        else {
            for (int i = 0; i < nNodes(); i++)
                if (adjList.get(i).contains(node))
                    neighbours.add(i);
        }
        return neighbours;
    }

    public int degree(int node) {
        return neighbours(node).size();
    }
}
