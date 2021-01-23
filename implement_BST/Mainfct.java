package implement_BST;

public class Mainfct {

	public static void main(String[] args) {
		B_S_T bst = new B_S_T();
		Node root = null;
		 
		root = bst.insert(root, 5);
		root = bst.insert(root, 15);
		root = bst.insert(root, 7);
		root = bst.insert(root, 0);
		root = bst.insert(root, 12);
		root = bst.insert(root, 6);
		root = bst.insert(root, 20);
		root = bst.insert(root, 1);
		root = bst.insert(root, 19);
		root = bst.insert(root, 22);
		root = bst.insert(root, 11);
		root = bst.insert(root, 13);
		
		bst.preorder(root);
		System.out.println();
		bst.postOrder(root);
		System.out.println();

		try {
			System.out.println("Smallest is : " + bst.smallest(root));
			System.out.println("Largest is : " + bst.largest(root));
			System.out.println("Weight is: " + bst.weight(root));
		}catch(Exception e) {
			System.out.println("Exception ocurred, most probably root is empty! " + e);
		}
		
		System.out.println("Sorted : " );
		bst.sortedOrder(root);

		root = bst.delete(root, 20);
		root = bst.delete(root, 0);
		
		System.out.println();
		
		System.out.println("Pre-Ordered: ");
		bst.preorder(root);
		System.out.println();
		System.out.println("Post-Ordered: ");
		bst.postOrder(root);
		System.out.println();
		
		try {
			System.out.println("Smallest is : " + bst.smallest(root));
			System.out.println("Largest is : " + bst.largest(root));
			System.out.println("Sorted : " );
			bst.sortedOrder(root);
			System.out.println();
			
			System.out.println("Search : " + bst.searchValue(root, 6));
			//System.out.println("weight = " + bst.weight(root));
			try{
				System.out.println("Inorder node: " + bst.inOrder(root, 11).value);
			}catch(Exception e) {
					System.out.println("Inorder node : No Inorder Parent!");
				}
			try {
				System.out.println("Parent node : " + bst.getParent(root, 15).value);
			}catch(Exception e) {
				System.out.println("Parent node : No Parent!");
			}
			try {
				System.out.println("Sibling node : " + bst.getSibling(root, 13).value);
			}catch(Exception e) {
				System.out.println("Sibling node : No Sibling!");
			}
			System.out.println("Max height is: " + bst.max_height(root));
			System.out.println("Weight is: " + bst.weight(root));
		}catch(Exception e) {
			System.out.println("Exception ocurred, most probably root is empty! " + e);
		}
		System.out.println();
		System.out.println("Lower-Ordered: ");
		bst.lowerOrder(root);
	}
}
