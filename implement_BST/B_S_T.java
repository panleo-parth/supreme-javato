package implement_BST;

import java.util.*;

public class B_S_T{
		
	public Node insert(Node node, int value) {
		if(node == null) return insert_first(value);
		
		if(value < node.value) {
			node.left = insert(node.left, value);
		}
		else if(value > node.value) {
			node.right = insert(node.right, value);
		}
		
		return node;
	}
	
	private Node insert_first(int value) {
		Node node = new Node();
		node.value = value;
		node.left = null;
		node.right = null;
		return node;
	}
	
	public int smallest(Node root)throws Exception {
		
		Exception e = new Exception();
		if(root == null) throw e;
		
		while(root.left != null) root = root.left;
		return root.value;
	}
	
	public int largest(Node root)throws Exception {
		Exception e = new Exception();
		if(root == null) throw e;
		
		while(root.right != null) root = root.right;
		return root.value;
	}
	
	public Node delete(Node root, int value) {
		
		if(root == null) return root;
		
			if(value < root.value) {
				root.left = delete(root.left, value);
			}
			else if(value > root.value) {
				root.right = delete(root.right, value);
			}
			else {
				if(root.left == null || root.right == null) {
					Node temp = null;
					temp = root.left == null ? root.right : root.left;
					
					if(temp == null) {
						return null;
					}
					else {
						return temp;
					}
				}
				else {
					Node successor = getSuccessor(root);
					root.value = successor.value;
					root.right = delete(root.right, successor.value);
					return root;
				}
			}
		
		return root;
	}
	
	private Node getSuccessor(Node root) {
		
		if(root == null) return null;
		
		Node temp = root.right;
		while(temp.left != null) {
			temp = temp.left;
		}
		return temp;
	}
	
	public void preorder(Node root) {
		if(root == null) return;
		
		System.out.print(root.value + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public void sortedOrder(Node root) {
		if(root == null) return;
		
		sortedOrder(root.left);
		System.out.print(root.value + " ");
		sortedOrder(root.right);
	}
	
	public void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.value + " ");
	}
	
	public boolean searchValue(Node root, int value) {
		if(root == null)
			return false;
		
		else if(root.value < value)
			return searchValue(root.right, value);
		
		else if(root.value > value)
			return searchValue(root.left, value);
		
		else if(root.value == value)
			return true;
		return false;
	}
	
	private static int size = 0;
	public int weight(Node root) {
		if(root == null)
			return 0;
		maxweight(root);
		return size + 1;
	}

	private void maxweight(Node root) {

		if(root == null)
			return;
		
		if(root.left != null) {
			size++;
			maxweight(root.left); 
		}
		if(root.right != null) {
			size++;
			maxweight(root.right);
		}
	}
	
	public Node getParent(Node root, int value)throws Exception {
		if(root == null || root.value == value) throw new Exception();
		
		if(root.value < value) {
			if(root.right.value == value) return root;
			return getParent(root.right, value);
		}
		
		else {
			if(root.left.value == value) return root;
			return getParent(root.left, value);
		}
	}
	
	public Node getSibling(Node root, int value)throws Exception {
		Exception e = new Exception();
		if(root == null || root.value == value) throw e;
		
		if(root.value < value) {
			if(root.right.value == value) return root.left;
			return getSibling(root.right, value);
		}
		
		if(root.value > value) {
			if(root.left.value == value) return root.right;
			return getSibling(root.left, value);
		}
		return null;
	}
	
	public Node inOrder(Node root, int value)throws Exception {
		if(root == null || root.value == value) throw new Exception();
		
		Node temp = root;
		
		while(root != null) {
			if(root.value < value) {
				if(temp.value < root.value)
					temp = root;
				root = root.right;
			}
			
			if(root.value > value) {
				if(temp.value < root.value)
					temp = root;
				root = root.left;
			}
			
			if(root.value == value) return temp;
		}
		return null;
	}
		
	public int max_height(Node root) {
		if(root == null) return -1;
		
		return 1+max_height(root.left) > 1+max_height(root.right) ? 1+max_height(root.left) : 1+max_height(root.right);
	}
	
	//breadth first search
	
	public void lowerOrder(Node root) {
		if(root == null) return;
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.peek();
			System.out.print(temp.value + " ");
			if(temp.left != null) q.add(temp.left);
			if(temp.right != null) q.add(temp.right);
			q.poll();
		}
	}
}
