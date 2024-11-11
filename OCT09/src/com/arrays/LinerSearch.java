package com.arrays;

public class LinerSearch {
	
	public static void main(String[] args) {
		int arr[]= {1,5,6,4,9,2};
		int target=9;
		boolean flag=false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
			{
				flag=true;
				System.out.println("Element Found");
			}
		}
		if(flag==false)
		{
			System.out.println("Element not foud");
		}
	}

}
