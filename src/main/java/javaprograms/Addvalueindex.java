package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Addvalueindex {

	public static void main(String[] args) {
		
		List<Integer> ex = new ArrayList<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(10);
		ex.add(40);
		ex.add(20);
		ex.add(50);
		ex.add(60);
		ex.add(50);
		ex.add(2,50);
		
		for(int i=0;i<ex.size();i++){
			
			int j = ex.get(i);
			System.out.println(j);
		}

		int a = ex.lastIndexOf(10);
		
	         ex.add(a,100);
	         
	     for(int k=0;k<ex.size();k++){
	    	 int l = ex.get(k);
	    	 System.out.println(l);
	     }
		
	}

}
