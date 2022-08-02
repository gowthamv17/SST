package javaprograms;

public class Consonantandvowels {

	public static void main(String[] args) {
		
		String s1 = "BeginnersBook";
		
		int v=0;
		int c=0;
		
		String s2 = s1.toLowerCase();
		for(int i=0;i<s2.length();i++){
			
			char d = s2.charAt(i);
			
			if(d == 'a'|| d=='e'|| d=='i'||d=='o'||d=='u'){
				v++;
			}
			else if(d>='a'||d<='z'){
				c++;
			}
		}
		
System.out.println(v);
System.out.println(c);

	}

}
