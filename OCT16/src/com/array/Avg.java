package com.array;

public class Avg {
	
	public static void main(String[] args) {
		
		int arr[]= {1,8,9,6,5,4};
		int avg=0;
		int sum=0;
		int n=arr.length;
		
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
			avg=sum/n;
			
		}
		System.out.println(sum);
		System.out.println(avg);
	}

}
