package com.code;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6};
		int sum1=0;
		int sum2=0;
		
		for(int i=1; i<=6; i++)
		{
			sum1=sum1+i;
		}
		for(int i=0; i<arr.length; i++)
		{
			sum2=sum2+arr[i];
		}
		int result=sum1-sum2;
		
		System.out.println(result);
		
	}

}
