package string;

public class UpperandLowerCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome@123";
		int upper=0;
		int lower=0;
		int number=0;
		int special=0;
		
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			
			if(c>='A' && c<='Z')
				upper++;
			else if(c>='a' && c<='z')
				lower++;
			else if(c>='0' && c<='9')
				number++;
			else
				special++;
		}
		
		System.out.println("upper case is "+upper);
		System.out.println("lower case is "+lower);
		System.out.println("Number is "+ number);
		System.out.println("Special is "+special);
	}

}

