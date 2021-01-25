package graphs;

public class Node_for_graph<K, E> {

	private K key = null;
	
	private K endNode = null;
	
	private E edgeLabel = null;
	
	public Node_for_graph(K key, K endNode, E edgeLabel) {
	
		this.key = key;
		this.endNode = endNode;
		this.edgeLabel = edgeLabel;
	}
	
	
	@Override
	public boolean equals(Object Node1) {
		return key.equals(Node1);
	}
	
	@Override
	public int hashCode() {
		return key.hashCode();
	}
	
	@Override
	public String toString() {
		return "{key : " + this.key + ", endNode : "
	+ this.endNode + ", edgeLabel : " + this.edgeLabel + "}";
	}
}
