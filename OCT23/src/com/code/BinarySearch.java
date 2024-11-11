package com.code;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[]= {45,63,90,100,1};
		int target=10;
		
		int l=0;
		int h=arr.length-1;
		
		boolean flag=false;
		
		for(int i=0; i<arr.length; i++)
		{
			int m=(l+h)/2;
			
			if(arr[m]==target)
			{
				flag=true;
				System.out.println("Element Found");
				break;
			}
			
			if(arr[m]>target)
			{
				h--;				
			}
			
			if(arr[m]<target)
			{
				l++;
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		
		
	}

}
