package com.string;

public class RemoveSpace2 {
	
	public static void main(String[] args) {
		
		String str="nhjvfyt65w5ew7ewukjcnm^&*";
		String replace=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(replace);
	}

}
