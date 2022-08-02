package javaprograms;

public class Stringcompare {

	public static void main(String[] args) {
		
		String s1 = "Nisha";
		String s2 = "Nisha";
		
		int hash = s1.hashCode();
		System.out.println(hash);
		
		int hash1 = s2.hashCode();
		System.out.println(hash1);
		
		if(hash==hash1){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		boolean compare = s1.equals(s2);
		System.out.println(compare);

	}

}
