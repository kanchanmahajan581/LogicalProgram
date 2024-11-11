package com.code;

public class IntegerPalindron {
	
	public static void main(String[] args) {
		
		int n=12235, digit=0, rev=0;
		
		int temp=n;
		
		while(n>0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
		
		if(rev==temp)
		{
			System.out.println("It is a Palindron Num");
		}
		else
		{
			System.out.println("It is not a Palindron Number");
		}
		
		
	}

}
