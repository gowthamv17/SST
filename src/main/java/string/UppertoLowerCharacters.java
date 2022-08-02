package string;

public class UppertoLowerCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String v = "WelcomE";
		StringBuffer str1 = new StringBuffer(v);
		
		int ln = v.length();
		
		for(int w=0;w<ln;w++){
			
			Character x = v.charAt(w);
			
			if(Character.isLowerCase(x)){
			
			str1.setCharAt(w, Character.toUpperCase(x));
			}
			
			else if(Character.isUpperCase(x)){
			str1.setCharAt(w, Character.toLowerCase(x));
			
		}
		}
			System.out.println("new conversion is "+str1);
	}

}
