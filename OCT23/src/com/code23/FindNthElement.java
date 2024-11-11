package com.code23;

public class FindNthElement {
	
	public static void main(String[] args) {
		
		int arr[]= {5,6,2,3,7,9,10};
		int n=5;
		
		if(n<arr.length)
		{
			int element=arr[n-1];
			System.out.println(element);
		}
	}

}
