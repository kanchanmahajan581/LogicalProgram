package com.string;

public class GivenString {
	public static void main(String[] args) {
		
		String s="aBACbcEDed";
		String s1=s.replaceAll("[^a-z]","");
		System.out.println("Lower Case String =>"+s1);
		
		String s2=s.replaceAll("[^A-Z]", "");
		System.out.println("Upper Case String =>"+s2);
		
	
		
		
	}

}
