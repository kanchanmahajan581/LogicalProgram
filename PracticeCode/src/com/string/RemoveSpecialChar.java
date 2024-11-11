package com.string;

public class RemoveSpecialChar {
	
	public static void main(String[] args) {
		
		String str="jknmnb346783hgfyts$#% byguilm*&$%%";
		
		String replace=str.replaceAll("[^a-zA-z]","");
		
		System.out.println(replace);
	}

}
