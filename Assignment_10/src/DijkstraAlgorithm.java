public class DijkstraAlgorithm {
    private static int getMinDistance(int[] DiatanceArr, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minIndex=-1;
        for (int i = 0; i < DiatanceArr.length; i++) {
            if (!visited[i] && DiatanceArr[i] < minDistance) {
                minDistance = DiatanceArr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void dijkstra(int[][] graph, int source) {
        int numVertices = graph.length;
        int[] DistanceArr = new int[numVertices];
        boolean[] visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            DistanceArr[i] = Integer.MAX_VALUE;
        }
        DistanceArr[source] = 0;
        for (int i = 0; i < numVertices - 1; i++) {
            int u = getMinDistance(DistanceArr, visited);
            visited[u] = true;
            for (int v = 0; v < numVertices; v++) {
                if(!visited[v] && graph[u][v] != 0 && DistanceArr[u] != Integer.MAX_VALUE && DistanceArr[u] + graph[u][v] < DistanceArr[v]){
                    DistanceArr[v] = DistanceArr[u] + graph[u][v];
                }
            }
        }

        for (int i = 0; i < numVertices; i++) {
            System.out.println("Distance from " + source + " to " + i + " is »»»» " + DistanceArr[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 5, 0, 2},
                {2, 0, 2, 5, 0},
                {5, 2, 0, 1, 3},
                {0, 5, 1, 0, 2},
                {2, 0, 3, 2, 0}
        };
        int source = 0;
        dijkstra(graph, source);
    }
}
