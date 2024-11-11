package com.string;

public class RemoveSpace {
	public static void main(String[] args) {
		String s="Java is a easy to Read";
		String replace=s.replaceAll("[^a-zA-z0-9]","");
		System.out.println(replace);
		
		
	}

}
