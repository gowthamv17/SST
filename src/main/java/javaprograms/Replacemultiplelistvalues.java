package javaprograms;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.Get;

public class Replacemultiplelistvalues {

	public static void main(String[] args) {
		
		List<Integer> ex = new ArrayList<Integer>();
		
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		ex.add(10);
		ex.add(60);
		ex.add(10);
		ex.add(70);
	
		
		for(int i=0;i<ex.size();i++){
			
			int j = ex.get(i);
		
				if(j==10){
				
					System.out.println(i);
			}
			
		}

		ex.set(0,100);
		ex.set(4, 100);
		ex.set(6, 100);
		
		for(int k=0;k<ex.size();k++){
			
			int m = ex.get(k);
			System.out.println(m);
		}
	}

}
