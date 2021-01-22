package queues;

public class ImplementingQueue<E> {

	private int toq;
	private int boq;
	private int size = 10;
	private Object[] elements = new Object[10];
	
	public ImplementingQueue() {
		toq = -1;
		boq = -1;
	}
	
	public void push(E element) {
		try {
			if(toq < size-1) {
				if(is_empty()) boq++;
				elements[++toq] = element;
			}
		}catch(Exception e) {
			System.out.println("Overflow");
		}
	}
	
	@SuppressWarnings("unchecked")
	public E pop() {
		try {
			if(!is_empty()) {
				return (E) elements[boq++];
			}
		}catch(Exception e) {
			System.out.println("Underflow!");
		}
		return null;
	}
	
	public boolean is_empty() {
		if(toq >- 1) return false;
		return true;
	}
}
