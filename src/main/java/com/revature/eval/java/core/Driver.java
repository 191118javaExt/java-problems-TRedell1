package com.revature.eval.java.core;

import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		
	}
		
	public String reverse(String string) {
		String input = "Alpha";
		System.out.println();
		char[]tryl = input.toCharArray();
		System.out.println(); 
		for(int i = tryl.length -1; i >= 0; i--)
			System.out.print(tryl[i]);
System.out.println("test");
		return reverse("Alpha");
	}


	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer> ();
		for (String s:strings) {
			
			if (!map.containsKey(s)) {  
				map.put(s, 1);
			}
			else {
				int count = map.get(s);
				map.put(s, count + 1);
				
			}
		}
		
		return map;
		
	}
	
}