package com.arrays;

public class Min {
	
	public static void main(String[] args) {
		
		int arr[]= {45,85,69,65,32,12,50};
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(min>arr[i])
				{
					min=arr[i];
				}	
			}
			
		}
		System.out.println(min);
	}

}
