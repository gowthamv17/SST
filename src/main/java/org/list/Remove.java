package org.list;

import java.util.ArrayList;
import java.util.List;

public class Remove {

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
		l.add(10);
		
		int k = l.lastIndexOf(10);
		System.out.println(k);
		
		l.remove(k);
		
	l.set(2, 350);
		System.out.println("full "+l);
		
	}

}
