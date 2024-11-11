package com.code;

import java.util.Scanner;

public class FindPowerUsingRescrsion {
	
	public static int power(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return x*power(x,n-1);
		}
	}
	
	public static void main(String[] args) {
		
		int x, n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X");
		
		x=sc.nextInt();
		
		System.out.println("Enter Y");
		n=sc.nextInt();
		
		System.out.println(power(x, n));
		
		
		
	}

}
