package org.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommonValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> l = new LinkedHashSet<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
		Set<Integer> l1 = new LinkedHashSet<>();
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(80);
		
		l1.removeAll(l);
		System.out.println(l1);
		
		
	}

}
