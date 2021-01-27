package search_and_sorting;

public class InsertionSort {

	public void sort(int[] array) {
		for(int i = 1; i<array.length; i++) {
			for(int j = i-1; j >= 0; j--) {
				if(array[j] > array[j+1]) {
					int temp =array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
