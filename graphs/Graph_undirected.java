package graphs;

import java.util.*;

public class Graph_undirected{
	
	public class Edge{
		private int weight;
		private int vertex;
		
		Edge(int vertex, int weight){
			this.vertex = vertex;
			this.weight = weight;
		}
		
		@Override
		public String toString() {
			return "{"+this.vertex+","+this.weight+"}";
		}
	}
	
	private static int total_vertices;
	LinkedList<Edge> graph[];
	
	@SuppressWarnings("unchecked")
	
	public Graph_undirected(int total_no_of_vertex){
		total_vertices = total_no_of_vertex;
		graph = new LinkedList[total_no_of_vertex];
		for(int i = 0; i<graph.length; i++) {
			graph[i] = new LinkedList<>();
		}
	}
	
	@SuppressWarnings("unchecked")
	Graph_undirected(int[][] adjacency_matrix){
		total_vertices = adjacency_matrix.length;
		graph = new LinkedList[total_vertices];
		for(int i = 0; i<graph.length; i++) {
			graph[i] = new LinkedList<>();
		}
		
		for(int i = adjacency_matrix.length-1; i >= 0; i--) {
			for(int j = adjacency_matrix[i].length-1; j >= 0; j--) {
				if(adjacency_matrix[i][j] != 0)
					addEdge(i, j, adjacency_matrix[i][j]);
			}
		}
	}
	
	public void addEdge(int at_vertex, int vertex, int weight) {
		graph[at_vertex].add(0, new Edge(vertex, weight));
		graph[vertex].add(0, new Edge(at_vertex, weight));
	}
	
	
	public boolean isConnected(int from_vertex, int to_vertex) throws Exception {
		if(to_vertex > graph.length-1 || to_vertex < 0 ||
				from_vertex > graph.length-1 || from_vertex < 0) throw new Exception();
		for(Edge vertex : graph[from_vertex]) {
			if(vertex.vertex == to_vertex)
				return true;
		}
		for(Edge vertex : graph[to_vertex]) {
			if(vertex.vertex == from_vertex)
				return true;
		}
		return false;
	}
	
	
	public void preorder() {
		for(int i = 0; i<graph.length; i++){
			for(Edge edge : graph[i]) {
				System.out.print(edge + " ");
			}
			System.out.println();
		}
	}
	
	
	public void levelorder() {
/*		
 * b	r	e	a	d	t	h		f	i	r	s	t		s	e	a	r	c	h
 */
	}
	
	
//	public int Dijkstra(int start_vertex, int end_vertex) throws Exception{
//		if(graph != null) {
//			boolean[] is_visited = new boolean[total_vertices];
//			int[] the_array = new int[total_vertices];
//			Arrays.fill(the_array, Integer.MAX_VALUE); 
//			for(Edge e : graph[start_vertex]) {
//				
//			}
//		}
//		return 0;
//	} 
	
	@Override
	public String toString() {
		String result = "";
		for(int i = 0; i<graph.length; i++) {
			result += i+"->"+graph[i]+"\n";
		}
		return result;
	}
}
