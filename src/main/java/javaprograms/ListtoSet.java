package javaprograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListtoSet {

	public static void main(String[] args) {
		
		List<Integer> ex = new ArrayList<Integer>();
		Set<Integer> ex1 = new LinkedHashSet<Integer>();
		
		ex.add(100);
		ex.add(200);
		ex.add(300);
		ex1.add(100);
		ex1.add(400);
		ex1.add(500);

		ex1.addAll(ex);
		System.out.println(ex);
		System.out.println(ex1);
	}

}
