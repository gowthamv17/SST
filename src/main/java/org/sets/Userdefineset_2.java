package org.sets;

import java.util.HashSet;
import java.util.Set;

public class Userdefineset_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student> a = new HashSet<>();
		
		// to get 1st student details
		System.out.println("1st student details");
		Student s1 = new Student();
		s1.setId(32);
		s1.setName("gowtham");
		s1.setNumber(111);
		System.out.println("2nd student details");
		Student s2 = new Student();
		s2.setId(33);
		s2.setName("brown mani");
		s2.setNumber(222);
		
		a.add(s1);
		a.add(s2);
		
		 for (Student s : a) {
			 
			 System.out.println(s.getId());
			 System.out.println(s.getName());
			 System.out.println(s.getNumber());
			
		}
		
		
	}

}
