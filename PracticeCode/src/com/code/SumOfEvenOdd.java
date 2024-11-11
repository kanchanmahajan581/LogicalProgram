package com.code;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		
		int arr[]= {5,6,8,9,3,2,1,4};
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
				
			}
		}
		System.out.print(sum);
	}

}
