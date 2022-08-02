package javaprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UserdefineMap {

	public static void main(String[] args) {
		
		Map<Integer,String> ex = new LinkedHashMap<Integer,String>();
		Scanner keyID = new Scanner(System.in);
		Scanner keyName = new Scanner(System.in);
		Scanner keymbleno = new Scanner(System.in);
		Scanner keyIDvalue = new Scanner(System.in);
		Scanner keyNamevalue = new Scanner(System.in);
		Scanner keymblenovalue = new Scanner(System.in);
		
		Scanner count = new Scanner(System.in);
		System.out.println("Enter count");
		int counts = count.nextInt();
		
		for(int i=0;i<counts;i++){
			int id = keyID.nextInt();
			System.out.println("Entered ID is " + id);
			String idname = keyIDvalue.nextLine();
			System.out.println("Entered ID Value is " + idname);
			ex.put(id, idname);
		}
		Set<Entry<Integer,String>> ex2 = ex.entrySet();
		for(Entry<Integer,String> k : ex2){
			
		System.out.println(k);
		}
	
//		for(int j=0;j<counts;j++){
//			String name = keyName.nextLine();
//			System.out.println("Entered Key Name is " + name);
//
//			
//			System.out.println("Entered Name is " + name);
//			int phoneno = mbleno.nextInt();
//			System.out.println("Entered mobileno is " + phoneno);
//
//		}

		
	}

}
