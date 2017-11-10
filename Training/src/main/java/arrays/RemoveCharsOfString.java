package arrays;

import java.util.Arrays;

public class RemoveCharsOfString {

	public static void main(String[] args) {
		String str = "ABCD$1234  679_  4k  ODC   ";
		char[] charr = {' ','$','_'};
		Arrays.sort(charr);
		char[] strarr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<strarr.length;++i){
			if(Arrays.binarySearch(charr, strarr[i]) < 0){
				sb.append(strarr[i]);
			}
		}
		
		System.out.println(sb);
		
		
	}

}
