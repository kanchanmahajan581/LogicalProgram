package com.string;

public class PalliondronString {
	
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,5,5};
		int temp[]=new int[arr.length];
		int j=0;
		
		
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]!=arr[i+1]) {
			temp[j]=arr[i];
			j++;
			}
		}
		temp[j]=arr[arr.length-1]; // To print last Value
		for(int i=0; i<arr.length-2; i++)
		{
			System.out.println(temp[i]);
		}

		
		
	}
	
	
}
