package graph;

public class Lgraph {
    private int V;
    private int E;
    private int[] adj;

    public Lgraph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = new int[V];
    }

    public Lgraph(int V, int E) {
        this.V = V;
    }
    public void addEdge(int v, int w) {
        //this.adj[v].add(w);
        //adj[v]++;
        adj[w]++;

    }
}
