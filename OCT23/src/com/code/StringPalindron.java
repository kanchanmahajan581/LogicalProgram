package com.code;

import java.util.Scanner;

public class StringPalindron {
	
	public static void main(String[] args) {
		
		String str="";
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println("It is a Palindron String");
		}
		else
		{
			System.out.println("It is not a Palindron");
		}
		
		
		
		
		
	}

}
