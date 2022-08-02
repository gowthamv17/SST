package org.lang;

public class StateDetails {
	
	public void southindia(){
		System.out.println("south");
	}

	public void northindia(){
		System.out.println("north");
	}
	
	public static void main(String[] args) {
		
		LanguageInfo info = new LanguageInfo();
		info.englishlanguage();
		info.hindilanguage();
		info.tamillanguage();
	
		
		StateDetails state = new StateDetails();
		state.southindia();
		state.northindia();
		
	}
}
