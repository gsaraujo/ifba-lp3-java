package graph;

import java.util.LinkedList;

public class Graph {
    private int V;
    private int E;
    private LinkedList<Integer>[] adj;
    private int[][] mat;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        this.mat = new int[V][V];
    }

    public void addEdge(int u, int v) {
        this.mat[u][v] = 1;
        this.E+=1;
    }
}
