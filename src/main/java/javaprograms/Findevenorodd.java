package javaprograms;

import java.util.Scanner;

public class Findevenorodd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner even = new Scanner(System.in);
		System.out.println("Enter number");
		
		int no = even.nextInt();
		System.out.println("Entered No is "+ no);
		
		if(no%2==0){
			
			System.out.println("Number is Even");
		}
		else{
			System.out.println("Number is odd");
		}
	}

}
