package javaprograms;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		Scanner age = new Scanner(System.in);
		System.out.println("Enter Age");
		int age1 = age.nextInt();
		System.out.println("Entered age is" + age1);
		
		if(age1>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not eligible");
		}
		

	}

}
