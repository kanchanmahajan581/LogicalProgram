package com.other;

public class SumOfDigit {
	public static void main(String[] args) {
		
		int n=145236;
		int digit;
		int sum=0;
		
		while(n>0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(sum);
	}

}
