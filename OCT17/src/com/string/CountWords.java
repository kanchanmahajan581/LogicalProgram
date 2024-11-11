package com.string;

public class CountWords {
	
	public static void main(String[] args) {
		
		String s="Java is a Good";
		String arr[]=s.split(" ");
		int count=0;
		
		for(int i=0; i<arr.length; i++)
		{
			count++;
		}
		
		System.out.println(count);
	}

}
