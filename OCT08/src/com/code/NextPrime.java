package com.code;

import java.util.Scanner;

public class NextPrime {
	
	
	public static void print(int n)
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
				System.out.println("Next Prime Number is "+ n);
			}			
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter Number");		
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		
		if(n<=1)
		{
			System.out.println("Enter Valid Number");
		}
		else
		{
			print(n);
		}
		
		
	}

}
