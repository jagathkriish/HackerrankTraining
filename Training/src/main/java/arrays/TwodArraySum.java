package arrays;

import java.util.Arrays;

public class TwodArraySum {
	
	public static void findSum(int[][] arr1, String[][] arr2){
		String[][] sum = new String[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2[0].length;j++){
					sum[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println(Arrays.deepToString(sum));
	}

	public static void main(String[] args) {
		int[][] arr1 = {{22,33},{4,45},{44,65}};
		String[][] arr2 = {{"A","B"},{"C","D"},{"ABC", "DEF"}};
		findSum(arr1, arr2);
		
		

	}

}
