package com.array;

import java.util.Scanner;

public class addElement {
	
	public static void main(String[] args) {
		
		int[] arr=new int [5];
		
		System.out.println("Enter The Element in array");
		Scanner sc=new Scanner(System.in);
		
		
		
		for(int i=0; i<arr.length-1; i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Element in the array");
		
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		System.out.println("Enter location");
		 int l=sc.nextInt();
		 
		 System.out.println("Enter Value");
		 int v=sc.nextInt();
		 
		 for(int i=arr.length-1; i>l; i--)
		 { 
			 arr[i]=arr[i-1];
		 }
		 
		 arr[l]=v;
		 for(int i:arr)
		 {
			 System.out.println(i);
		 }
	}

}
