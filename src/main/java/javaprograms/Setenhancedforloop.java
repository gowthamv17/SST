package javaprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setenhancedforloop {

	public static void main(String[] args) {
		
		Set<Integer> ex = new LinkedHashSet<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(40);
		ex.add(50);
		
		for(int i:ex){
			System.out.println(i);
		}

	}

}
