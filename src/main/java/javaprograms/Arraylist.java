package javaprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		List<Integer> leng = new LinkedList<Integer>();
		leng.add(10);
		leng.add(20);
		leng.add(30);
		leng.add(10);
		leng.add(50);
		
		int i = leng.size();
		System.out.println(i);
		
		

	}

}
