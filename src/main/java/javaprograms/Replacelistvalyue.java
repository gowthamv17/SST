package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Replacelistvalyue {

	public static void main(String[] args) {
		
		List<Integer> ex = new ArrayList<Integer>();
		ex.add(100);
		ex.add(200);
		ex.add(300);
		ex.add(100);
		ex.add(40);
		
		int k = ex.indexOf(300);
		ex.set(k, 350);
		for(int i=0;i<ex.size();i++){
					
			int j = ex.get(i);
				
				System.out.println(j);
			}
		}

	}


