package org.list;

import java.util.ArrayList;
import java.util.List;

public class GetListValue {

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
		
		Integer j = l.get(2);
		System.out.println(j);
		
		for (Integer k : l) {

			System.out.println(k);
		}
	}

}
