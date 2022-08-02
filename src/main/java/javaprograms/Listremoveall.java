package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Listremoveall {

	public static void main(String[] args) {
		
		List<Integer> ex = new ArrayList<Integer>();
		List<Integer> ex1 = new ArrayList<Integer>();
		ex.add(100);
		ex.add(200);
		ex.add(300);
		ex.add(400);
		ex.add(100);
		ex1.addAll(ex);
		ex1.add(600);
		ex1.add(700);
		System.out.println(ex);
		System.out.println(ex1);
		ex1.removeAll(ex);
		System.out.println(ex1);

	}

}
