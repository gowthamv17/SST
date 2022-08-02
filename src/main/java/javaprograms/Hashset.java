package javaprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		
		Set<Integer> ex = new LinkedHashSet<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		ex.add(50);
		ex.add(60);
		ex.add(70);
		ex.add(80);
		ex.add(10);
		ex.add(20);
		
	System.out.println(ex);
	}

}
