package com.code;

public class SumUsingRecursion {
	
	public static int sumDigit(int n)
	{
		int digit, sum=0;
		while(n>0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
			sumDigit(n);
		}
		return sum;
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int n=12;
		
		System.out.println(sumDigit(n));
	}

}
