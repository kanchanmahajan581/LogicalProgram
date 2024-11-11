package com.code;

import java.util.Scanner;

public class Power {
	
	public static int power(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			
			return x*power(x, n-1);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int x,n;
		
		System.out.println("Enter Value of X");
		x=sc.nextInt();
		System.out.println("Enter Value of N");
		n=sc.nextInt();
		
		System.out.println(power(x, n));
	}

}
