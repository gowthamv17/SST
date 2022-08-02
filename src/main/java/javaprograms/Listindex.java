package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Listindex {

	public static void main(String[] args) {
		
		List<Integer> ex = new ArrayList<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(90);
		ex.add(10);
		
	for(int i=0; i<ex.size();i++){
		int s = ex.get(i);
		if(s==10){
			System.out.println(i);
		}
		
	}
		
	}

}
