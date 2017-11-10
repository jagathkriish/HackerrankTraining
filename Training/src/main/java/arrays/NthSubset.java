package arrays;

public class NthSubset {
	
	public static void findSmalestSubSet(int[] arr, int len) {
		int count = 0;
		int tmp = 0;
		for(int i=0;i<arr.length-1;i++) {
			tmp = i+1;
			while(tmp != arr.length) {
				if(arr[i] != arr[tmp] && (count < len)) {
					System.out.print(" "+arr[tmp]+" ");
					count++;
				}else {
					if(count == len) {
						break;
					}else {
						count = 0;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		findSmalestSubSet(new int[]{ 1, 1, 2, 2, 3, 3, 4, 5}, 3);

	}

}
