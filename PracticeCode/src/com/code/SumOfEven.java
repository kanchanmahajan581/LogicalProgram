package com.code;

public class SumOfEven {
	
	public static void main(String[] args) {
		
		int arr[]= {45,89,65,22,44,75};
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
		
	}

}
