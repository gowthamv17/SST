package javaprograms;

public class Convertvowelstospecial {

	public static void main(String[] args) {
		
		String s1 = "Welcome";
		
		for(int i=0;i<s1.length();i++){
			
			char ch = s1.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				
				System.out.println(s1.replace(ch, '@'));
			}
		}

	}

}
