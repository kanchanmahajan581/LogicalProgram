package com.code;

public class FindPrimenum {
	public static void main(String[] args) {
		
		int n=31;
		
		int count=0;
		if(n<=1)
		{
			System.out.println("It is not a prime Number");
		}
		
		for(int i=2; i<=n/2; i++)
		{
			
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("It is prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
		
	}

}
