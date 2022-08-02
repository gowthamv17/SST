package javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> ex = new LinkedHashMap<Integer,String>();
		ex.put(10, "raj");
		ex.put(20, "gowtham");
		ex.put(30, "raju");
		ex.put(40, "java");
		ex.put(50, "sql");
		ex.put(10, ".net");
		ex.put(20, "c++");
		
		Set<Entry<Integer,String>> ex2 = ex.entrySet();
		for(Entry<Integer,String> j :ex2){
			System.out.println(j.getValue());
			System.out.println(j.getKey());
		}
	}

}
