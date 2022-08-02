package org.constr;

public class ConstructorA extends ConstructorB {

		  public ConstructorA() {
			  super();
		    System.out.println("Default const...");
		    
		  }

	
		  public static void main(String[] args) {
		    ConstructorA a = new ConstructorA();
		  }

		}