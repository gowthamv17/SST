package javaprograms;

import java.util.Scanner;

public class Age {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner age = new Scanner(System.in);
		System.out.println("Enter Age");
		
		int ages = age.nextInt();
		System.out.println("Entered Age is "+ages);
		
		if(ages<=18){
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not eligible for vote");
		}

	}

}
