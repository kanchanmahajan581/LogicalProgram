package com.code;

public class LinerSearch {
	
	public static void main(String[] args) {
		
		int arr[]= {5,6,8,9,7};
		
		int target=5;
		
		boolean flag=false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
			{
				flag=true;
				System.out.println("Element found");
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}

}
