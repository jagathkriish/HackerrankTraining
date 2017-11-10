package arrays;

import java.util.Arrays;

public class ArrayHelperMethods {

	public static void main(String[] args) {
		
		int[][] twodarr = new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;i<4;i++) {
			twodarr[i][j] = i+1;
			}
		}
		
		int[][] twodarr1 = Arrays.copyOf(twodarr, 4);
		twodarr1[0][0] = 50;
		System.out.println(Arrays.deepToString(twodarr));
		System.out.println(Arrays.deepToString(twodarr1));
		System.out.println("two 2ds comparision " + Arrays.equals(twodarr1, twodarr));

		int[] arr = {1,44,55,33,22,41,28,60,32};
		String s1 = "Hello";
		String s2 = new String("Hello");
		String[] sarr = {"Easy", "To", "Wipe", "Wide", "Allow"};
		String[] sarr4 = sarr;
		String[] tmps = {"Easy", "To", "Wipe", "Wide", "Allow", s1, null};
		String[] tmps1 = {"Easy", "To", "Wipe", "Wide", "Allow", s2, s1};
		Arrays.sort(arr);
		Arrays.sort(sarr);
		String[] sarr2 = Arrays.copyOf(sarr, sarr.length);
		String[] sarr3 = Arrays.copyOfRange(sarr, 0, sarr.length);
		sarr[0] = "Hello";
		sarr[1] = "world";
		System.out.println("tmps compares tmps1 is " + Arrays.equals(tmps1,tmps));
		
		
		System.out.println(Arrays.binarySearch(sarr, "Wipe"));
		// System.out.println(Arrays.binarySearch(tmps, "Wipe"));
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sarr));
		System.out.println(Arrays.toString(sarr2));
		System.out.println(Arrays.toString(sarr3));
		System.out.println(Arrays.toString(sarr4));

	}

}
