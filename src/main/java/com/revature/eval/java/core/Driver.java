package com.revature.eval.java.core;

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
}
