package org.occurance;

import java.util.LinkedHashMap;
import java.util.Map;



public class CharacterCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Welcome";
		
		char[] a = s.toCharArray();
		
		Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<a.length;i++){
			
			char each = a[i];
			
			if(m.containsKey(each)){
				Integer c = m.get(each);
				m.put(each, c+1);
			}
			else{
				
				m.put(each, 1);
			}
			
		}
		System.out.println(m);
	
	}

}
