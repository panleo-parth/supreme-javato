package implement_BST;

import java.util.LinkedList;
import java.util.Queue;

public class A_V_L__Trees<T extends Comparable<T>>{
	A_V_L__Node<T> root;
	
	public A_V_L__Trees(){
		root = null;
	}
	
	public T Maximum() {
		A_V_L__Node<T> local = root;
		if(local == null) 
			return null;
		while(local.getRight() != null) 
			local = local.getRight();
		return local.getData();
	}
	
	public T Minimum() {
		A_V_L__Node<T> local = root;
		if(local == null)
			return null;
		while(local.getLeft() != null)
			local = local.getLeft();
		return local.getData();
	}
	
	public int depth(A_V_L__Node<T> node) {
		if(node == null)
			return 0;
		return node.getDepth();
	}
	
	public A_V_L__Node<T> insert(T data){
		root = insert(root, data);
		switch(balanceNumber(root)) {
		case 1:
			root = rotateLeft(root);
			break;
		case 2:
			root = rotateRight(root);
			break;
		default:
			break;
		}
		return root;
	}

	public A_V_L__Node<T> insert(A_V_L__Node<T> node, T data){
		if(node == null)
			return new A_V_L__Node<T>(data);
		if(node.getData().compareTo(data) > 0) {
			node = new A_V_L__Node<T>(node.getData(), insert(node.getLeft(), data), node.getRight());
		}
		if(node.getData().compareTo(data) < 0) {
			node = new A_V_L__Node<T>(node.getData(), node.getLeft(), insert(node.getRight(), data));
		}
		
		switch(balanceNumber(node)) {
		case 1:
			node = rotateLeft(node);
			break;
		case 2:
			node = rotateRight(node);
			break;
		default:
			return node;
		}
		return node;
	}
	
	private A_V_L__Node<T> rotateRight(A_V_L__Node<T> node) {
		A_V_L__Node<T> q = node;
		A_V_L__Node<T> p = q.getLeft();
		A_V_L__Node<T> c = q.getRight();
		A_V_L__Node<T> a = p.getLeft();
		A_V_L__Node<T> b = p.getRight();
		
		q = new A_V_L__Node<T>(q.getData(), c, a);
		p = new A_V_L__Node<T>(p.getData(), q, b);
		return p;
	}

	private A_V_L__Node<T> rotateLeft(A_V_L__Node<T> node) {
		A_V_L__Node<T> q = node;
		A_V_L__Node<T> p = q.getRight();
		A_V_L__Node<T> c = q.getLeft();
		A_V_L__Node<T> a = p.getLeft();
		A_V_L__Node<T> b = p.getRight();
		
		q = new A_V_L__Node<T>(q.getData(), c, a);
		p = new A_V_L__Node<T>(p.getData(), q, b);
		return p;  
	}

	private int balanceNumber(A_V_L__Node<T> node) {
		int L = depth(node.getLeft());
		int R = depth(node.getRight());
		if(L - R >= 2) 
			return -1;
		else if(L - R <= -2) 
			return 1;
		return 0;
	}
	
	public void PrintTree() {
		root.level = 0;
		Queue<A_V_L__Node<T>> queue = new LinkedList<A_V_L__Node<T>>();
		queue.add(root);
		while (!queue.isEmpty()) {
			A_V_L__Node<T> node = queue.poll();
			System.out.println(node);
			int level = node.level;
			A_V_L__Node<T> left = node.getLeft();
			A_V_L__Node<T> right = node.getRight();
			if (left != null) {
				left.level = level + 1;
				queue.add(left);
			}
			if (right != null) {
				right.level = level + 1;
				queue.add(right);
			}
		}
	}
}
