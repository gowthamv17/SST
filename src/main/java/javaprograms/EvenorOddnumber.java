package javaprograms;

import java.util.Scanner;

public class EvenorOddnumber {

	public static void main(String[] args) {
		
		Scanner even = new Scanner(System.in);
		System.out.println("Enter Number");
		int evenorodd = even.nextInt();
		System.out.println("Entered Number is " + evenorodd);
		
		if (evenorodd%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
