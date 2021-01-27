package search_and_sorting;

import java.util.*;

public class BucketSort {

	public void sort(int[] array) {
		
		int maxelement = findMax(array);
		/*------------------Passes------------------*/
		int placevalue = 1;
		while(maxelement/placevalue > 0) {
			sort(array, placevalue);
			placevalue *= 10;
		}
		/*------------------------------------------*/
	}

	private void sort(int[] array, int placevalue) {
		
		int output[] = new int[array.length];
		int[] bucket = new int[10];
		Arrays.fill(bucket, 0);
		
		for(int i = 0; i < array.length; i++) {
			bucket[(array[i]/placevalue)%10]++;
		}
		
		for(int i = 1; i<array.length; i++) {
			bucket[i] += bucket[i-1];
		}
		
		for(int i = array.length-1; i>= 0; i--) {
			output[bucket[(array[i]/placevalue)%10]-1] = array[i];
			bucket[(array[i]/placevalue) % 10]--;
		}
		
		for(int i = 0; i< array.length; i++) {
			array[i] = output[i];
		}
	}

	private int findMax(int[] array) {
		
		int max = array[0];
		for(int x : array) {
			if(x > max)
				max = x;
		}
		return max;
	}
}
