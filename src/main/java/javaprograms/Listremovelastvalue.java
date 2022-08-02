package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Listremovelastvalue {

	public static void main(String[] args) {
		
		List<Integer> ex = new ArrayList<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(90);
		ex.add(10);
		ex.add(10);
		ex.add(40);

		int a = ex.lastIndexOf(10);
		ex.remove(a);
		for(int i=0;i<ex.size();i++){
			int s = ex.get(i);
			System.out.println(s);
			
		}
	}

}
