
package com.array;

public class Median {
	
	public static void main(String[] args) {
		
		int arr[]= {1,8,9,6,5,4};
		int median=0;
		int l=0;
		int h=arr.length-1;
		
		for(int i=0; i<arr.length; i++)
		{
			median=(l+h)/2;
			
		}
		System.out.println(arr[median]);
	}

}
