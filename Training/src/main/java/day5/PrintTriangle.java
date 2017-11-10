package day5;

public class PrintTriangle {
	
	public static void trianglePrint(int length){
		double tmp = Math.floor(length/2);
		int tmp1 = -2;
		for(int i=0;i<(int)tmp+1;i++){
			System.out.print(new String(new char[(int)tmp-i]).replace("\0", " "));
			for(int j=0;j<i+1;j++){
				System.out.print((j==i)?(getNextEven(tmp1)):(getNextEven(tmp1)+" "));
				tmp1 = getNextEven(tmp1);
			}
			System.out.println(new String(new char[(int)tmp-i]).replace("\0", " "));
		}
	}
	
	public static int getNextEven(int no){
		return no+2;
	}

	public static void main(String[] args) {
		trianglePrint(7);
		

	}

}
