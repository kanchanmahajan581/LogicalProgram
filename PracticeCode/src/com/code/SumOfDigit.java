package com.code;

public class SumOfDigit {
	public static void main(String[] args) {
		
		int num=12345;
		int digit,sum=0;
		
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.print(sum);
		
	}

}
