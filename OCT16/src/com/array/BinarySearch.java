package com.array;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int key=5;
		int l=0;
		int h=arr.length-1;
		boolean flag=false;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			if(arr[m]==key)
			{
				flag=true;
				System.out.println("Elemnt Found");
				break;
			}
			if(arr[m]<key)
			{
				l=m+1;
			}
			if(arr[m]>key)
			{
				h=h-1;
			}		
			
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		
		
	}

}
