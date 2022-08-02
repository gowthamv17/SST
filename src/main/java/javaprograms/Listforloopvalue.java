package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Listforloopvalue {

	public static void main(String[] args) {
		
		List<Integer> ex = new ArrayList<Integer>();
		ex.add(105);
		ex.add(205);
		ex.add(305);
		ex.add(405);
		ex.add(505);
		ex.add(605);
		
		for(int i=0;i<ex.size();i++){
			
			int j=ex.get(i);
			System.out.println(j);
		}

	}

}
