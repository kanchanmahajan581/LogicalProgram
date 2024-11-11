package com.code;

public class ReverseString {
	public static void main(String[] args) {
		
		String s="We are Learning Java";
		String[] arr=s.split(" ");		
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
	
	

}
