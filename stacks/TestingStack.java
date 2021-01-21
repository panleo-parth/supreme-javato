package stacks;

public class TestingStack {

	public static void main(String[] args) {

		ImplementingStack<String> im = new ImplementingStack<>();
		
			im.push("Aj");
			im.push("Ak");
			im.push("Al");
			im.push("Am");
			im.push("An");
			im.push("Ao");
			im.push("Ap");
			im.push("Aq");
			im.push("Ar");
			im.push("As");
			im.push("OP");
		
		for(int n = 0; n<10; n++) {
			System.out.println(n + " : " + im.pop());
		}
		
		System.out.println(im.is_empty());
	}
}
