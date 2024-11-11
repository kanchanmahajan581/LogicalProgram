package com.code;

public class FindPrime {
	public static void main(String[] args) {
		
		int n=3;int count=0;
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
			System.out.println("it is not a prime number");
		}
		
	}

}
