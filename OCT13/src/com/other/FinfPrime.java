package com.other;

import java.util.Scanner;

public class FinfPrime {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("Enter Number");
		n=sc.nextInt();
		int count=0;
		
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
			
		}
		
		if(count==0)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
		
	}

}
