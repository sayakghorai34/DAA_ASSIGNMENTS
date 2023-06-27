import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class KruskalsMST {
    static class Edge {
        int src, dest, weight;
        public Edge(int src, int dest, int weight)
        {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    static class Subset {
        int parent, rank;
        public Subset(int parent, int rank)
        {
            this.parent = parent;
            this.rank = rank;
        }
    }
    private static void kruskals(int V, List<Edge> edges)
    {
        int j = 0;
        int noOfEdges = 0;
        Subset[] subsets = new Subset[V];
        Edge[] results = new Edge[V];
        for (int i = 0; i < V; i++) {
            subsets[i] = new Subset(i, 0);
        }
        while (noOfEdges < V - 1) {
            Edge nextEdge = edges.get(j);
            int x = findRoot(subsets, nextEdge.src);
            int y = findRoot(subsets, nextEdge.dest);
            if (x != y) {
                results[noOfEdges] = nextEdge;
                union(subsets, x, y);
                noOfEdges++;
            }
            j++;
        }
        System.out.println(
                "Edges in MST:");
        int minCost = 0;
        for (int i = 0; i < noOfEdges; i++) {
            System.out.println(results[i].src + " ====» "
                    + results[i].dest + "  --Weight= "
                    + results[i].weight);
            minCost += results[i].weight;
        }
        System.out.println("Total cost of MST: " + minCost);
    }

    private static void union(Subset[] subsets, int x,
                              int y)
    {
        int rootX = findRoot(subsets, x);
        int rootY = findRoot(subsets, y);

        if (subsets[rootY].rank < subsets[rootX].rank) {
            subsets[rootY].parent = rootX;
        }
        else if (subsets[rootX].rank
                < subsets[rootY].rank) {
            subsets[rootX].parent = rootY;
        }
        else {
            subsets[rootY].parent = rootX;
            subsets[rootX].rank++;
        }
    }
    private static int findRoot(Subset[] subsets, int i)
    {
        if (subsets[i].parent == i)
            return subsets[i].parent;

        subsets[i].parent
                = findRoot(subsets, subsets[i].parent);
        return subsets[i].parent;
    }



    public static void main(String[] args)
    {
        int V = 9;
        List<Edge> graphEdges = new ArrayList<>(
                List.of(
                        new Edge(0, 1, 4),
                        new Edge(0, 7, 8),
                        new Edge(1, 2, 8),
                        new Edge(1, 7, 11),
                        new Edge(2, 3, 7),
                        new Edge(2, 8, 2),
                        new Edge(2, 5, 4),
                        new Edge(3, 4, 9),
                        new Edge(3, 5, 14),
                        new Edge(4, 5, 10),
                        new Edge(5, 6, 2),
                        new Edge(6, 7, 1),
                        new Edge(6, 8, 6),
                        new Edge(7, 8, 7)));
        graphEdges.sort(Comparator.comparingInt(o -> o.weight));
        kruskals(V, graphEdges);
    }
}
