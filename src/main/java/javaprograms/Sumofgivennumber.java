package javaprograms;

public class Sumofgivennumber {

	public static void main(String[] args) {
		
		int m,n,sum=0;
		
		m=12345;
		
		while(m>0){
			
			n=m%10;
			sum=sum+n;
			m=m/10;
		}

		System.out.println(sum);
	}

}
