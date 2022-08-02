package javaprograms;

import java.util.Scanner;

public class Countnumber {

	public static void main(String[] args) {
		
		int n;
		int i=0;
		
		Scanner inputs = new Scanner(System.in);
		n=inputs.nextInt();
		System.out.println("Enter Number");

		while(n>0){
			n=n/10;
			i++;
			
		}
		System.out.println(i);
	}

}
