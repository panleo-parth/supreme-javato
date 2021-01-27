package search_and_sorting;

public class ShellSort {

	public void sort(int[] array) {
	
		sort(array, array.length);
	}

	private void sort(int[] array, int length) {
		
		int inner = 0;
		int interval = length / 3;
		int outer = inner + interval;
		
		while(outer < length) {
				if(array[inner] > array[outer]) {
				int temp = array[inner];
				array[inner] = array[outer];
				array[outer] = temp;
			}
			inner++;
			outer = inner + interval;
		}
		new InsertionSort().sort(array);
	}
}
