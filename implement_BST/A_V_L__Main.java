package implement_BST;

public class A_V_L__Main {

	public static void main(String[] args) {
		
		A_V_L__Trees<Integer> tree = new A_V_L__Trees<Integer>();
		for (int i = 1; i <= 17; i++)
			tree.insert(i);

		tree.PrintTree();
	}
}
