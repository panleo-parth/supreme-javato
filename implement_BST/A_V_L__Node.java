package implement_BST;

public class A_V_L__Node<T extends Comparable<T>> implements Comparable<A_V_L__Node<T>>{
	
	private T data;
	private A_V_L__Node<T> left;
	private A_V_L__Node<T> right;
	public int level;
	private int depth;
	
	public A_V_L__Node(T data){
		this(data, null, null);
	}

	public A_V_L__Node(T data, A_V_L__Node<T> left, A_V_L__Node<T> right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
		
		if(left == null && right == null) {
			setDepth(1);
		}
		else if(left == null) {
			setDepth(right.getDepth() + 1);
		}
		else if(right == null) {
			setDepth(left.getDepth() + 1);
		}else {
			setDepth(Math.max(right.getDepth(), left.getDepth()) + 1);
		}
	}

	public int getDepth() {
		return this.depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public A_V_L__Node<T> getRight(){
		return this.right;
	}
	
	public void setRight(A_V_L__Node<T> right) {
		this.right = right;
	}
	
	public A_V_L__Node<T> getLeft(){
		return this.left;
	}
	
	public void setLeft(A_V_L__Node<T> left) {
		this.left = left;
	}
	
	@Override
	public int compareTo(A_V_L__Node<T> object) {
		return this.data.compareTo(object.data);
	}
	
	@Override
	public String toString() {
		return "Level " + this.level + " : " + this.data;
	}
}