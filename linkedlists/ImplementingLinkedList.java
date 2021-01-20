package linkedlists;

public class ImplementingLinkedList<E> {

	public class Node<F>{
		Node<F> next;
		F data;
		
		public Node(F data){
			this.next = null;
			this.data = data;
		}
	}
	private Node<E> head;
	private Node<E> tail;
	private Node<E> temp;
	private int current_size;
	
	public ImplementingLinkedList() {
		head = tail = temp = null;
		current_size = 0;
	}
	
	public boolean is_empty() {
		if(head == null) return true;
		return false;
	}
	
	public void add_Last(E data) {
		Node<E> node = new Node<>(data);
		if(head == null) {
			head = tail = node;
		}
		else {
			tail.next = node;
			tail = node;
		}
		current_size++;
	}
	
	public void add_First(E data) {
		Node<E> node = new Node<>(data);
		if(head == null) {
			head = tail = node;
		}
		else {
			node.next = head;
			head = node;
		}
		current_size++;
	}
	
	public void add_At(E data, int index) {
		Node<E> node = new Node<>(data);
		temp = head;
		if(index == 0) {
			add_First(data);
			return;
		}
		if(index == current_size) {
			add_Last(data);
			return;
		}
		if(head == null) {
			head = tail = node;
		}
		else {
			int ind = 0;
			while(ind != index-1) {
				temp = temp.next;
				index--;
			}
			node.next = temp.next;
			temp.next = node;
		}
		current_size++;
	}
	
	public E get() {
		if(head != null) {
			for(temp = head; temp != tail.next; temp = temp.next) {
				System.out.println(temp.data);
			}
		}
		return null;
	}
	
	public E remove_First() {
		if(head == null) {
			return null;
		}
		temp = head;
		if(head == tail) {
			head = tail = null;
			current_size--;
			return temp.data;
		}
		head = head.next;
		current_size--;
		return temp.data;
	}
	
	public E remove_Last() {
		if(head == null || head == tail) return remove_First();
		E data;
		temp = head;		
		while(temp.next != tail) {
			temp = temp.next;
		}
		data = tail.data;
		tail = temp;
		tail.next = null;
		current_size--;
		return data;
	}
	
	public E remove_At(int index) {
		if(index == 0) return remove_First();
		if(index == current_size-1) return remove_Last();
		temp = head;
		E data;
		while(index != 1) {
			temp = temp.next;
			index--;
		}
		data  = temp.next.data;
		temp.next = temp.next.next;
		current_size--;
		return data;
	}
	
	public int size_of_the_list() {
		return current_size;
	}
	
	public E peek_First() {
		if(head == null) return null;
		return head.data;
	}
	
	public E peek_Last() {
		if(tail == null) return null;
		return tail.data;
	}
}
