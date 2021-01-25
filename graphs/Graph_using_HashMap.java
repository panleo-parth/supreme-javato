package graphs;

import java.util.*;

public class Graph_using_HashMap<K, E> {

	Map<K, List<Node_for_graph<K, E>>> Graph = null;
	
	public Graph_using_HashMap() {

		Graph = new HashMap<>();
	}
	
	public void addEdge(K key, K endNode, E edgeLabel) {
		
		if(!Graph.containsKey(key)) {
			Graph.put(key, new LinkedList<>());
		}
		
		Graph.get(key).add(new Node_for_graph<>(key, endNode, edgeLabel));
	}
	
	@Override
	public String toString() {
		String result = "";
		for(K key : Graph.keySet()) {
			result += key + " -> [ " + Graph.get(key) + " ] \n";
		}
		return result;
	}
}
