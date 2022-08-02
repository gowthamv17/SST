package org.list;

import java.util.ArrayList;
import java.util.List;

public class ListPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(10);
		
		for(int i=0;i<l.size();i++){
			
			int k = l.get(i);
	
		if(k==10){
			
			//int j = l.indexOf(k);
			System.out.println("10th index is "+i);
		}
		else{
			System.out.println("");
		
		}
	}
	}
}
