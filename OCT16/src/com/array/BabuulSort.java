package com.array;

public class BabuulSort {
	
	public static void main(String[] args) {
		
		int arr[]= {4,2,1,5,3};
		int n=arr.length;
		int temp=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}

}
