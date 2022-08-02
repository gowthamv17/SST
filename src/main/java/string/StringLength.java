package string;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "GreensTechnology";
		String b = "SeleniumAutomationTool";
		String c = "velmurugan";
		String d = "j a v a p r o g r a m";
		String e = "8870211473";
		String m = "greensTechnology";
		String n = "gowtham.v17@gmail.com";
		String o = "Welcome to Java Class";
		
		int f = a.length();
		System.out.println(f);
		
		int g = b.length();
		System.out.println(g);
		
		int h = c.length();
		System.out.println(h);
		
		int i = d.length();
		System.out.println(i);
		
		int j = e.length();
		System.out.println(j);
		
		int k = a.lastIndexOf('o');
		System.out.println(k);
		
		int l = b.indexOf('o');
		System.out.println(l);
		
		
		Boolean aa = a.equalsIgnoreCase(m);
		System.out.println(aa);
		
		Boolean aaa = n.contains("@");
		System.out.println(aaa);
		
		String p = o.replace(' ', '#');
		System.out.println(p);
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter input");
		String s = scn.next();
		System.out.println("Entered Input is " +s);
		
		if(s.contains("gmail")){
			
			String t = s.replace("gmail", "yahoo");
			System.out.println(t);
		}
		
		String t = "NISHANTHI";
		String u = t.toLowerCase();
		System.out.println(u);
		
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
