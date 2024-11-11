package com.string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="Java is a best";
		String arr[]=s.split(" ");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
