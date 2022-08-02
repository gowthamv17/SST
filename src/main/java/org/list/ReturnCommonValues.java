package org.list;

import java.util.ArrayList;
import java.util.List;

public class ReturnCommonValues {

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
		
		
		List<Integer> k = new ArrayList<>();
		k.add(30);
		k.add(40);
		k.add(50);
		k.add(60);
		k.add(80);
		
		k.removeAll(l);
		
		System.out.println(k);
	}

}
