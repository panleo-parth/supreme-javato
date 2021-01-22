package queues;

public class TestingQueue {

	public static void main(String[] args) {

		ImplementingQueue<String> im = new ImplementingQueue<>();
		
			im.push("Ak");
			im.push("As");
			im.push("Al");
			im.push("Ao");
			im.push("Ap");
			im.push("Au");
			im.push("Ad");
			im.push("Am");
			im.push("An");
			im.push("Ac");
		
		System.out.println("Queue status : " + im.is_empty());
		
		for(int n = 0; n<10; n++) {
			System.out.println(im.pop());
		}
		
		System.out.println("Queue status : " + im.is_empty());
		
	}
}
