package javaprograms;

import java.util.Scanner;

public class Primenumbercheck {

	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		
		n = input.nextInt();
		
		int count=0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				count=1;
			}
		}
if(count==0)
{
	System.out.println("Entered Number is Prime");
}
else
{
	System.out.println("Entered Number is not Prime");
}
	}

}
