package com.code;

public class MaxArray {
	
	public static void main(String[] args) {
		
		int arr[]= {45,23,69,85,74,12};
		
		int max=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
