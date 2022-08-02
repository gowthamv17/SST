package org.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class JSONRead {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		
		FileReader r = new FileReader("D:\\Selenium files\\workspace\\Json\\src\\test\\resources\\JSON\\Config.json");
		JSONParser p = new JSONParser();
		
		Object o = p.parse(r);
		JSONObject j1 = (JSONObject)o;
		Object o1 = j1.get("ad");
		
	
		JSONObject j2 = (JSONObject)o1;
		System.out.println(j2.get("url"));
		System.out.println(j2.get("text"));
		
	}

}
