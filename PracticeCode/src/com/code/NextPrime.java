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
					break;
				}
			}
			if(isPrime)
			{
				System.out.println("Next Prime Number= " +n);
			}
		}
	}	
	
public static void main(String[] args) {
		
		int n;
		int count=0;
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n<1)
		{
			System.out.println("Enter ValidNum");
		}
		else
		{
			nextPrime(n);
		}
		
	}

}
