package com.array;

public class PairSumOfGiven {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		int sum=9;
		
		int low=0;
		int high=arr.length-1;
		
		while(low<high)
		{
			if(arr[low]+arr[high]<sum)
			{
				low++;
			}
			else if(arr[low]+arr[high]>sum)
			{
				high--;
			}
			else if(arr[low]+arr[high]==sum)
			{
				System.out.println("pair("+arr[low]+","+arr[high]+")");
				low++;
				high--;
				
			}
			
			
		}
		
		
	}

}
