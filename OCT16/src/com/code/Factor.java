package com.code;

import java.util.Scanner;

public class Factor {
	
	public static int fact(int n)
	{
		
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");		
		int n;
		n=sc.nextInt();
		
		System.out.println(fact(n));	
		
		
		
	}
	
	

}
