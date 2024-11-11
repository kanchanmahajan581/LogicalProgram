package com.array;

public class Arrays1 {
	
	public static void main(String[] args) {
		
		int arr[]= {1,8,9,6,5,4};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println("Min Number in Array"+ min);
		System.out.println("Max Number in Array"+max);
	}

}
