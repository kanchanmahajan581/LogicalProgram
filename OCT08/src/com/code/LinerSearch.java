package com.code;

public class LinerSearch {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		int target=3;
		boolean flag=false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
			{
				flag=true;
				System.out.println("Element found" + target);				
			}
		
	}
	if(flag==false)
	{
		System.out.println("Element not found");
	}
	
	}

}
