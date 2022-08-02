package org.constr;

public class ConstructorB {

	public ConstructorB() {
		this(50);
	    System.out.println("Super class");
	  }
	
	public ConstructorB(int id) {
		System.out.println("super");
	    System.out.println(id);
	  }
	
	 
}
