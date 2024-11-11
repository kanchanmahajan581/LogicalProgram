package com.other;

import java.util.Scanner;

public class NextPrime {
	
	public static void nextPrime(int n)
	{
		boolean isPrime=false;
		
		while(!isPrime)
		{
			isPrime=true;
			n++;
			
			for(int i=2; i<n/2; i++)
			{
				if(n%i==0)
				{
					isPrime=false;
				}
			}
			
			if(isPrime)
			{
				System.out.println("next Prime number"+n);
			}
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Number");
		n=sc.nextInt();
		
		if(n<=1)
		{
			System.out.println("Enter Valid Number");
		}
		else
		{
			nextPrime(n);
		}
		
	}

}
