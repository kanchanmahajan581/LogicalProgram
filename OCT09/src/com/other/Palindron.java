package com.other;

public class Palindron {
	public static void main(String[] args) {
		int n=12142513;
		int digit;
		int rev=0;
		int temp=n;
		
		while(n>0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("It is a Palinbdron");
		}
		else
		{
			System.out.println("It is not a Palindron");
		}
		System.out.println(rev);
	}

}
