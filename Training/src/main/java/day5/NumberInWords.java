package day5;

import java.util.HashMap;
import java.util.Map;

public class NumberInWords {
	public static enum Numbers { One, Two, Three, Four };
	public static String printInWords(int no){
		Map<Integer, String> digitMap = new HashMap<Integer, String>();
		digitMap.put(1, "One");
		digitMap.put(2, "Two");
		digitMap.put(3, "Three");
		digitMap.put(4, "Four");
		digitMap.put(5, "Five");
		digitMap.put(6, "Six");
		digitMap.put(7, "Seven");
		digitMap.put(8, "Eight");
		digitMap.put(9, "Nine");
		
		Map<Integer, String> suffixMap = new HashMap<Integer, String>();
		suffixMap.put(2, "Hundred");
		suffixMap.put(3, "Thousand");
		suffixMap.put(4, "Thousand");
		suffixMap.put(5, "Lakh");
		suffixMap.put(6, "Crore");
		
		Map<Integer, String> tensMap = new HashMap<Integer, String>();
		tensMap.put(1, "Ten");
		tensMap.put(2, "Twenty");
		tensMap.put(3, "Thirty");
		tensMap.put(4, "Fourty");
		tensMap.put(5, "Fifty");
		tensMap.put(6, "Sixty");
		tensMap.put(7, "Seventy");
		tensMap.put(8, "Eighty");
		tensMap.put(9, "Ninety");
		
		if(no<10){
			return "Invalid input";
		}else{
			String ntos = Integer.toString(no);
			if(Integer.parseInt(ntos.substring(1,ntos.length())) == 0){
				return digitMap.get(no/(no/Integer.parseInt(ntos.substring(0,1))))+" "+suffixMap.get(ntos.length()-1);
			}
			
			
			if(no >= 100 && no<=1000){
				return digitMap.get(no/100)+" hunderd "+tensMap.get((no/10)%10)+" "+digitMap.get(no%10);
			}
			
			if(no >= 1000 && no<=100000){
				return (no==1000)?(digitMap.get(no/100)+" Thousand"):
					((no==100000)?(digitMap.get(no/100)+" Lakh"):
					((no>=10000)?(tensMap.get(no/10000)+" Thousand "+digitMap.get((no/10000)%10)+" hundred "+tensMap.get((no/10000)%10)+" "+digitMap.get(no%10)):(digitMap.get(no/1000)+" Thousand "+digitMap.get((no/10)%10)+" hundred "+tensMap.get((no/10)%10)+" "+digitMap.get(no%10))));
			}
			
			return "0";
			
			/*if(no >= 100000 && no<=1000000){
				return (no==10000)?(digitMap.get(no/100)+" Lakh"):((no==10000)?(digitMap.get(no/100)+" Lakh"):(digitMap.get(no/1000)+" Thousand "+digitMap.get((no/10)%10)+" hundred "+tensMap.get((no/10)%10)+" "+digitMap.get(no%10)));
				System.out.println(digitMap.get(no/1000)+" Thousand "+digitMap.get((no/10)%10)+" hundred "+tensMap.get((no/10)%10)+" "+digitMap.get(no%10));
			}*/
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(printInWords(200000));
		Numbers.valueOf("One");

	}

}
