package com.string;

public class FindDuplicateChar {
	public static void main(String[] args) {
		
		String s="Java is a Best";		
		char arr[]=s.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}			
				
			}
			if(count>=1)
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
