package com.code;

import java.util.Scanner;

public class FindPrime {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		n=sc.nextInt();
		int count=0;
		
		for(int i=2; i<=n/2; i++)
		{
			
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("It is a prime Number");
		}
		else {
			System.out.println("It is not a prime Number");
		}
			
		
		
		
	}

}
