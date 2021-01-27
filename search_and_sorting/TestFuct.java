package search_and_sorting;

import java.util.Arrays;

public class TestFuct {

	public static void main(String[] args) {
		
		int[] arr = {832, 745, 678, 241, 15, 1114, 453, 72, 21, 1515};
		new BucketSort().sort(arr);
		System.out.print(Arrays.toString(arr));
	}
}
