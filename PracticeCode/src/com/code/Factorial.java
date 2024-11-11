package com.code;

import java.util.Scanner;

public class Factorial {
	
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
		
		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The value of X");
		
		n=sc.nextInt();
		
		System.out.println(fact(n));
		
	}

}
