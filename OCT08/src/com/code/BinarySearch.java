package com.code;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		 int target=8;
		 boolean flag=false;
		 
		 int l=0;
		 int h=arr.length-1;
		 
		 while(l<h)
		 {
			 flag=true;
			 
			 int m=(l+h)/2;
			 
			 if(arr[m]==target)
			 {
				System.out.println("Element Found"); 
				break;
			 }
			 if(arr[m]<target)
			 {
				l=m+1; 
			 }
			 if(arr[m]>target)
			 {
				 h=m-1;
			 }
			 
			 
			
		 }
		 
		 
	}

}
