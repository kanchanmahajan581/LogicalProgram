package com.string;

public class PalindronString {
	
	public static void main(String[] args) {
		
		String s="Radar";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println("It is a pallindron String");
		}
		else
		{
			System.out.println("It is not a pallindron string");
		}
		
		System.out.println(rev);
		
		
	}

}
