package com.code;

import java.util.Scanner;

public class NextPrime {
	
	public static void nextPrime(int n)
	{
		
		boolean isPrime=false;
		
		while(!isPrime)
		{
			isPrime=true;
			n++;
			
			for(int i=2; i<=n/2; i++)
			{
				if(n%i==0)
				{
					isPrime=false;
				}
			}
			
			if(isPrime)
			{
				System.out.println("Next Prime Number => "+n);
			}
			
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		n=sc.nextInt();
		
		nextPrime(n);
		
		
		
		
	}

}
