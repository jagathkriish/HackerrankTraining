package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static void main(String[] args) {
		List<Object> lst = new ArrayList<Object>();
		lst.add("ABC");
		lst.add("BBC");
		lst.add(0.123f);
		lst.add(true);
		Collections.shuffle(lst);
		System.out.println(lst.get(0));

	}

}
