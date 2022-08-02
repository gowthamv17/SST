package javaprograms;

public class Removeduplicatesinarray {

	public static void main(String[] args) {

		int a[]= {10,10,20,50,60,80,60,50};
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}
		}
		
	}

}
}
