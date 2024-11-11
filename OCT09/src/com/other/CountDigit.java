package com.other;

public class CountDigit {
	public static void main(String[] args) {
		int n=1245632 , digit;
		int count=0;
		
		while(n>0)
		{
			digit=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
