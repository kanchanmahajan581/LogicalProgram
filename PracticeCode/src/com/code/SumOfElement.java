package com.code;

public class SumOfElement {
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,6,3,4,8};
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
