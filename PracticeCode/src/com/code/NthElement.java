package com.code;

import java.util.Scanner;

public class NthElement {
	
	public static void main(String[] args) {
		
		int arr[]= {45,12,32,56,98,45};
		int n=5;
//		System.out.println("Enter number");
//		Scanner sc=new Scanner(System.in);
//		
//		n=sc.nextInt();
		
		if(n<arr.length)
		{
			int element=arr[n-1];
			System.out.println(element);
		}
		
		
		
		
	}

}
