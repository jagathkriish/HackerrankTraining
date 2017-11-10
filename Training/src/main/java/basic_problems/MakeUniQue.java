package basic_problems;
import java.util.Scanner;

public class MakeUniQue {
	
	public static int count;
	public static void makeUnique(char[] chr,int index){
		if(index != chr.length) {
			// System.out.println(chr[index]);
			for(int i=index+1;i<chr.length;i++) {
				count ++;
				if(chr[i] != chr[index]) {
					count--;
					makeUnique(chr,i);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		// makeUnique("AAABBBCCC".toCharArray(),0);
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		for(int i=0;i<no;++i){
			makeUnique(sc.next().toCharArray(),0);
			System.out.println(count);
			count = 0;
		}
		sc.close();
	}	

}
