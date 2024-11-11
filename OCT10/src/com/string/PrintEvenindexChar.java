package com.string;

public class PrintEvenindexChar {
	public static void main(String[] args) {
		
		String s="kanchan";
		char arr[]=s.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
