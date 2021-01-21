package stacks;

public class ImplementingStack<E> {

	private int tos;
	private Object[] elements = new Object[10];
	private E max;
	
	public ImplementingStack() {
			tos = -1;
			max = null;
	}
	
	public boolean is_empty() {
		return (tos == -1) ? true : false;
	}
	
	public void push(E data) {
		try{
			if(tos == 9) {
				System.out.println("Stack is full!");
			}
			
			elements[++tos] = data;
		}catch(Exception e) {
			System.out.println("Can't add more!");
		}
	}
	
	@SuppressWarnings("unchecked")
	public E pop() {
		try {
			if(tos < 0) {
				System.out.println("Stack underflow!");
				return null;
			}
			return (E)elements[tos--];
		}catch(Exception e) {
			System.out.println("OOPS!");
		}
		return null; 
	}

	public E max() {
		return max;
	}
}
