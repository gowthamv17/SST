package javaprograms;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		int a;
		int n;
		int i=0;
		int j=0;
		
		Scanner an = new Scanner(System.in);
		n=an.nextInt();
		a=n;
		
		while(a>0){
			
			i =a%10;
			j=(j*10)+i;
			a=a/10;
			
		}

		System.out.println(j);
	}

}
