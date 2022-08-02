package org.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AddAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
		Set<Integer> s = new LinkedHashSet<>();
		s.addAll(l);
		System.out.println(s);
		
		for (Integer i : s) {
			
			System.out.println(i);
			
		}
	}

}
