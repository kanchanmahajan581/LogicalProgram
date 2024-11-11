package com.string;

public class NumString {
	
	public static void main(String[] args) {
		
		String input="3240012100";
		String formate=String.format("%011d",Long.parseLong(input));
		System.out.println(formate);
	}

}
