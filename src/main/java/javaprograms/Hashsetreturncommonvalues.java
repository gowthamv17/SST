package javaprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashsetreturncommonvalues {

	public static void main(String[] args) {
		List<Integer> ex = new ArrayList<Integer>();
		
		Set<Integer> ex1 = new HashSet<Integer>();
		
		
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(90);
		ex.add(10);
		ex.add(10);
		ex.add(40);
		ex.add(30);
		ex.add(60);
		ex1.add(80);
		
		ex1.addAll(ex);
		System.out.println(ex);
		System.out.println(ex1);
		ex1.removeAll(ex);
		System.out.println(ex1);

	}

}
