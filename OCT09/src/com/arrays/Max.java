package com.arrays;

public class Max {
	public static void main(String[] args) {
		int arr[]= {45,85,69,65,32,12,50};
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
		}
		System.out.println(max);
	}

}
