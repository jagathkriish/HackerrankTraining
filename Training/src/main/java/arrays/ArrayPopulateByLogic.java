package arrays;

import java.util.Arrays;

public class ArrayPopulateByLogic {
	
	public static void findSum(int[][] arr1){
		int[][] res = new int[arr1.length][arr1[0].length];
		int tmp = 0;
		int index = 0;
		int index2 = 0;
		for(int i=arr1.length-1;i>=0;i--){
			for(int j=0;j<arr1[0].length;j++){
				tmp = tmp+arr1[i][j];
				if(index2 < arr1.length-1){
					res[j][index2] = arr1[i][j];
				}
			}
			index2++;
			res[index][arr1[0].length-1] = tmp;
			index++;
			tmp =0;
		}
		
		System.out.println(Arrays.deepToString(res));
	}

	public static void main(String[] args) {
		int[][] arr1 = {{2,3,4},{4,5,6},{20,30,40}};
		int[][] arr2 = {{2,3},{4,5}};
		findSum(arr2);
		findSum(arr1);

	}

}
