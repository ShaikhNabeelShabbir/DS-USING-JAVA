import java.util.ArrayList;
import java.util.Iterator;

public class GraphSearchDFS {
    int V;
    ArrayList<Integer>[] adj;

    public GraphSearchDFS(int noOfVertices) {
        V=noOfVertices;
        adj=new ArrayList[noOfVertices];
        for (int i = 0; i < noOfVertices; i++) {
            adj[i]=new ArrayList<>();
        }
    } 
    public void edge(int x,int y) {
        adj[x].add(y);
    }
    public void DFS(int source) {
        boolean[] visited=new boolean[V];
        java.util.Stack<Integer> s1 =new java.util.Stack<>();
        s1.push(source);
        int node;
        while (!s1.empty()) {
            source=s1.peek();
            s1.pop();
        
        for (int i = 0; i<adj[source].size(); i++) {
            node=adj[source].get(i);
            if (!visited[node]) {
                s1.push(node);
            }
        }
        if (visited[source]==false) {
        System.out.print(source+"");
            visited[source]=true;
        }

    }}
    public static void main(String[] args) {
        GraphSearchDFS g1=new GraphSearchDFS(6);
        g1.edge(0, 1); 
        g1.edge(0, 2);
        g1.edge(0, 5);
        g1.edge(1, 0);
        g1.edge(1, 2);
        g1.edge(2, 0);
        g1.edge(2, 1);
        g1.edge(2, 3);  
        g1.edge(2, 4);
        g1.edge(3, 2);
        g1.edge(4, 2);
        g1.edge(4, 5);
        g1.edge(5, 0);
        g1.edge(5, 4);

        g1.DFS(0);
    }
}
