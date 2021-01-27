package search_and_sorting;

public class MergeSort {

	private int[] temp;
	private int[] array;
	private int length;
	
	
	public void sort(int[] array) {
		
		this.array = array;
		this.length = array.length;
		this.temp = new int[this.length];
		divide(0, this.length-1);
	}
	
	
	private void divide(int lowerIndex, int upperIndex) {
		
		if(lowerIndex < upperIndex) {
			int middle = (lowerIndex + upperIndex)/2;
			
			divide(lowerIndex, middle);
			
			divide(middle+1, upperIndex);
		
			merge(lowerIndex, middle, upperIndex);
		}
	}


	private void merge(int lowerIndex, int middle, int upperIndex) {
		
		int lower = lowerIndex;
		int mid = middle + 1;
		int index = lowerIndex;
		
		for(int i = 0; i<this.array.length; i++) {
			this.temp[i] = array[i];
		}
		
		while(lower <= middle && upperIndex >= mid) {
			if(this.temp[lower] <= this.temp[mid]) {
				array[index] = temp[lower];
				lower++;
			}else {
				array[index] = temp[mid];
				mid++;
			}
			index++;
		}
		
		while(lower <= middle) {
			array[index] = temp[lower];
			lower++;
			index++;
		}
	}
}
