package com.array;

import java.util.Scanner;

public class FindNthElement {
	public static void main(String[] args) {
		
		int arr[]= {5,6,7,8,2,32};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter N");
		
		int n;
		n=sc.nextInt();
		
		
		if(n<=arr.length)
		{
			int e=arr[n-1];
			System.out.println(e);
			
		}
		
		
	}

}
