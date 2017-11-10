package arrays;

import java.util.Arrays;

public class ArrayFindNoOfInserts {
	
	public static int findNumberOfInserts(int[] arr) {
		int count = 0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i] != 1) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(findNumberOfInserts(new int[] {4, 5, 3, 8, 6, 7}));

	}

}
