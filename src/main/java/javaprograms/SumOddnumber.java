package javaprograms;

public class SumOddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		
		for(int i=1;i<=100;i++){
			if(i%2==1){
				count=count+i;
			}
			
		}
		System.out.println(count);
		
	}

}
