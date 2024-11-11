package com.array;

public class MinArray {
	public static void main(String[] args) {
		
		int arr[]= {45,25,96,12,74,3};
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
