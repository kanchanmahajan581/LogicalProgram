package com.code;

import java.util.Scanner;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner sc= new Scanner(System.in);		
		String str="Kanchan";
		
		char arr[]=str.toCharArray();
		
		
		
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count==0)
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
