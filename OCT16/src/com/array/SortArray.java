package com.array;

public class SortArray {
	
	public static void main(String[] args) {
		int arr[]= {1,8,9,6,5,4};
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
			System.out.print(arr[i]+" ");
	}
		System.out.println("Decsnding Order");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("Smmalest Element = "+arr[0]);
		System.out.println("Largest Element = "+arr[arr.length-1]);
		System.out.println("Second Largest = "+arr[arr.length-2]);
		
	}

}
