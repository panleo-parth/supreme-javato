package search_and_sorting;

public class SelectionSort {

	public void sort(int[] array) {
		for(int i = 0; i<array.length; i++) {
			int small = smallest(array, i);
			swap(array, small, i);
		}
	}

	private void swap(int[] array, int small, int i) {
		int temp = array[small];
		array[small] = array[i];
		array[i] = temp;
	}

	private int smallest(int[] array, int startindex) {
		int small = startindex;
		for(int i = startindex; i<array.length; i++) {
			if(array[i] < array[small] ) {
				small = i;
			}
		}
		return small;
	}
}
