package javaprograms;

public class Smallcapsnumber {

	public static void main(String[] args) {
		
		String s1 = "Welcome To Java class @123";
		
		int caps=0;
		int small=0;
		int number =0;
		int special=0;
		
		for(int i=0;i<s1.length();i++){
			char ch = s1.charAt(i);
			
			if(ch>='A'&&ch<='Z'){
				caps++;
			}
			else if(ch>='a'&&ch<='z'){
				small++;
			}
			else if(ch>='0'&& ch<='9'){
				number++;
			}
			else{
				special++;
			}
		}

		System.out.println(caps);
		System.out.println(small);
		System.out.println(number);
		System.out.println(special);
	}

}
