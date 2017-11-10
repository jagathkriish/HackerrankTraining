package arrays;

import java.util.Arrays;

public class ArrayTest {
	public static void findSum(int[][] arr1){
		System.out.println(arr1[0].length+"  "+arr1.length);
		int[][] sum = new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[0].length;j++){
				System.out.println(arr1[i][j]);
			}
		}
		System.out.println(Arrays.deepToString(sum));
	}

	public static void main(String[] args) {
		int[][] arr1 = {{22,33},{4,45},{44,65}};
		findSum(arr1);
	}

}
