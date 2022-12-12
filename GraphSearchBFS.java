import java.util.*;;
public class GraphSearchBFS {
    int V;
    ArrayList<Integer>adjacency[];
    

    public GraphSearchBFS(int noOfVertices) {
        V=noOfVertices;
        adjacency=new ArrayList[noOfVertices];
        for (int i = 0; i < noOfVertices; i++) {
            adjacency[i]=new ArrayList<>();
        }
    }
    public void edge(int x,int y) {
        adjacency[x].add(y);
    }
    public void BFS(int source) {
        boolean[] visited=new boolean[V];
        ArrayList<Integer> a1 =new ArrayList<Integer>();
        visited[source]=true;
        a1.add(source);
        while (!a1.isEmpty()) {
            source=a1.remove(0);
            System.out.print(source+"");
            Iterator i=adjacency[source].iterator();
            while (i.hasNext()) {
                int n=(int)i.next();
                if (!visited[n]) {
                    visited[n]=true;
                    a1.add(n);
                }
            }
        }

    }


    public static void main(String[] args) {
        GraphSearchBFS G1=new GraphSearchBFS(6);
        G1.edge(0, 1); 
        G1.edge(0, 2);
        G1.edge(0, 5);
        G1.edge(1, 0);
        G1.edge(1, 2);
        G1.edge(2, 0);
        G1.edge(2, 1);
        G1.edge(2, 3);  
        G1.edge(2, 4);
        G1.edge(3, 2);
        G1.edge(4, 2);
        G1.edge(4, 5);
        G1.edge(5, 0);
        G1.edge(5, 4);

        G1.BFS(0);

    }
}
