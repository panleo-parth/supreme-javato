package graphs;

public class GraphTest {

	public static void main(String[] args) {

//		Graph graph = new Graph(10);
//		graph.addEdge(3, 4, 10);
//		graph.addEdge(4, 8, 100);
//		graph.addEdge(0, 5, 101);
//		graph.addEdge(1, 2, 110);
//		graph.addEdge(5, 6, 510);
//		graph.addEdge(4, 7, 120);
//		System.out.println(graph);
//		try {
//			System.out.println(graph.isConnected(6, 4));
//			System.out.println(graph.isConnected(3, 4));
//		} catch (Exception e) {
//			System.out.println("Error!");
//		}
//		graph.preorder();
		
		int[][] n = {
						{0, 2, 4, 0}, 
						{1, 0, 3, 2, 5}, 
						{9, 4, 0, 1}, 
						{2, 5, 1, 0},
						{}
				};
		Graph_undirected graph = new Graph_undirected(n);
		System.out.println(graph);
		try {
			System.out.println(graph.isConnected(4, 1));
			System.out.println(graph.isConnected(0, 1));
		} catch (Exception e) {
			System.out.println("Error!");
		}
		graph.preorder();
	}

}
