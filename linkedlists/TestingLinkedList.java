package linkedlists;

public class TestingLinkedList {

	public static void main(String[] args) {
		
		ImplementingLinkedList<String> im = new ImplementingLinkedList<>();
		im.add_First("As");
		im.add_Last("Ad");
		im.add_Last("AF");
		im.add_First("AE");
		im.add_At("As", 4);
		im.add_Last("Ac");
		im.add_Last("An");
		im.add_Last("Ab");
		im.add_At("Aw", 0);
		im.add_At("Aq", 9);
		
		im.get();
		
		System.out.println(" " + im.size_of_the_list());
		
		System.out.println("Item: " + im.remove_First());
		System.out.println("Item: " + im.remove_Last());
		System.out.println("Item: " + im.remove_At(3));
		System.out.println("Item: " + im.remove_At(5));
		System.out.println("Item: " + im.remove_At(0));
		System.out.println("Item: " + im.remove_At(0));
		System.out.println("Item: " + im.remove_At(0));
		System.out.println("Item: " + im.remove_At(0));
		System.out.println("Item: " + im.remove_At(0));
		
		im.get();
		
		System.out.println(" " + im.size_of_the_list());
		System.out.println(" " + im.peek_First() + " " + im.peek_Last());
		
	}
}
