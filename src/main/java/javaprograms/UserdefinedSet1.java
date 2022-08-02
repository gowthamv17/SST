package javaprograms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UserdefinedSet1 extends UserdefineSet{

	
	public static void main(String[] args) {
		//List<Integer> emp2 = new ArrayList<Integer>();
		Set<Integer> emp1 = new LinkedHashSet<Integer>();
		Set<String> emp3 = new LinkedHashSet<String>();
		Set<Integer> emp4 = new LinkedHashSet<Integer>();
		
		UserdefinedSet1 emp = new UserdefinedSet1(); 
		Scanner ID = new Scanner(System.in);
		Scanner names = new Scanner(System.in);
		Scanner phonenumber = new Scanner(System.in);
		

	for(int i=0;i<3.;i++){
		System.out.println("Please Enter ID  ");
		int EnterID = ID.nextInt();
			emp.setId(EnterID);
		System.out.println("Please Enter Name ");	
			String name = names.nextLine();
			emp.setName(name);
		System.out.println("Please Enter mobileno. ");
		int mblenumber = phonenumber.nextInt();
		emp.setPhoneno(mblenumber);
		
			emp1.add(EnterID);
			emp3.add(name);
			emp4.add(mblenumber);
				
	}
	
	System.out.println("Sets ID are " + emp1);
	System.out.println("Sets names are " + emp3);
	System.out.println("Sets phone numbers are " + emp4);
	
}
}