package javaprograms;

import java.util.Scanner;

public class Armstrongnumbercheck {

	public static void main(String[] args) {
		int n;
		int a;
		int i=0;
		int j=0;
		
		Scanner an = new Scanner(System.in);
		n = an.nextInt();
		a=n;
		
		while(a>0){
			i=a%10;
			j = j+(i*i*i);
			a=a/10;
		}
		if(n==j){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Non Prime Number");
		}
		

	}

}
