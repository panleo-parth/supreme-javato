package search_and_sorting;

public class HeapSort {

	public void sort(int[] array) {
		
		int length = array.length;
		
		for(int i = length/2-1; i>=0; i--) {
			sort(array, length, i);
		}
		
		//swap the elements
		
		for(int i = length-1; i>=0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			sort(array, i, 0);
		}
	}

	private void sort(int[] array, int length, int indexofparent) {
		
		int largest = indexofparent;
		int leftchildindex = 2 * indexofparent + 1;
		int rightchildindex = 2 * indexofparent + 2;
		
		if(leftchildindex < length && array[leftchildindex] > array[largest]) {
			largest = leftchildindex;
		}
		
		if(rightchildindex < length && array[rightchildindex] > array[largest]) {
			largest = rightchildindex;
		}
		
		if(largest != indexofparent) {
			int temp = array[indexofparent];
			array[indexofparent] = array[largest];
			array[largest] = temp;
			
			sort(array, length, largest);
		}
	}
}
