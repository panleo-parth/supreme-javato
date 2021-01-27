package search_and_sorting;

public class QuickSort {

	public void sort(int[] array) {
		sort(array, 0, array.length-1);
	}

	private int Best_of_Three(int[] array, int start, int end) {
		int mid = (start + end)/2;
		int pivot = array[start] > array[end] ? 
				(array[start] < array[mid] ? array[start] : array[mid]) : 
					array[end] < array[mid] ?
						array[end] : array[mid];
						
		return partition(array, 0, array.length-1, pivot);
	}

	private int partition(int[] array, int start, int end, int pivot) {
		while(start <= end) {
			while(array[start] < pivot) {
				start++;
			}
			while(array[end] > pivot) {
				end--;
			}
			if(start <= end) {
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				
				start++;
				end--;
			}
		}
		return start;
	}
	
	private void sort(int[] array, int start, int end) {
		int partition = Best_of_Three(array, start, end);
		if(start < partition-1) {
			sort(array, start, partition-1);
		}
		if(partition < end) {
			sort(array, partition, end);
		}
	}
}