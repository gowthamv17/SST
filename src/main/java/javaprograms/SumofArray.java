package javaprograms;

public class SumofArray {

	public static void main(String[] args) {
		
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
		int sum=0;
		
		for(int i : array){
			
			sum=sum+i;
		}

		System.out.println(sum);
		
		int avg = sum/array.length;
		System.out.println(avg);
	}

}
