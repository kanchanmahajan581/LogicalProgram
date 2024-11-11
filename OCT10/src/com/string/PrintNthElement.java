package com.string;

import java.util.Scanner;

public class PrintNthElement {
	public static void main(String[] args) {
		
		int arr[]= {45,52,36,85,96,12};
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Value of n");
		n=sc.nextInt();
		
		if(n<=arr.length)
		{
			int element=arr[n-1];
			System.out.println(element);
		}
	}

}
