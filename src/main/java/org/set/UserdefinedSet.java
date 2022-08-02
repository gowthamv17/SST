package org.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UserdefinedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> b = new HashSet<>();
		Set<String> c = new HashSet<>();
		Set<Integer> d = new HashSet<>();
		
		Scanner s = new Scanner(System.in);
		for (Integer f : d) {
			
		
			System.out.println("Enter emp id");
			int a = s.nextInt();
	
			b.add(a);
			System.out.println("Enter emp name");
			String name = s.next();
			
			c.add(name);
			
			System.out.println("Enter Phno");
			int phno = s.nextInt();
	
			d.add(phno);
		}
		
		
		
		System.out.println("id is " + b);
		System.out.println("name is "+c);
		System.out.println("phoneno is "+d);
	
		
	}

}
