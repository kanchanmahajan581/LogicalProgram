package com.string;

public class GivenStringCharInt {
	
	public static void main(String[] args) {
		
		String s="Subbu123raj";
		String replace1=s.replaceAll("[^a-zA-Z]","");
		String replace2=s.replaceAll("[^0-9]", "");
		
		System.out.println(replace1);
		System.out.println(replace2);
	}

}
