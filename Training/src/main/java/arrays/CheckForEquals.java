package arrays;

import java.util.Arrays;

public class CheckForEquals {

	public static void main(String[] args) {
		int[][] arr1 = {{1,3},{5,'b'}};
		int[][] arr2 = {{2,3},{4,5}};
		int[][] arr3 = {{1,3},{5,'b'}};
		
		System.out.println(Arrays.deepEquals(arr1,arr3));
		

	}

}
