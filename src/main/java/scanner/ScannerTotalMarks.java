package scanner;

import java.util.Scanner;

public class ScannerTotalMarks {
	public static int k;
	public static void test(){
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner marks = new Scanner(System.in);
		
		System.out.println("Enter Student Details & Marks");
		
		System.out.println("Enter Student Id");
		int id = marks.nextInt();
		System.out.println("Entered Id is "+id);
		
		System.out.println("Enter Student Name");
		String name = marks.next();
		System.out.println("Entered Name is "+ name);
		
		
		System.out.println("Enter Mark1");
		int mark1 = marks.nextInt();
		System.out.println("Entered Mark1 is "+mark1);
		
		System.out.println("Enter Mark2");
		int mark2 = marks.nextInt();
		System.out.println("Entered Mark2 is "+mark2);
		
		System.out.println("Enter Mark3");
		int mark3 = marks.nextInt();
		System.out.println("Entered Mark3 is "+mark3);
		
		int total = mark1+mark2+mark3;
		System.out.println("Total is "+total);
		
		
		
		
	}

}
