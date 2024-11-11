package com.code;

public class CountTheNum {
	public static void main(String[] args) {
		
		int num=1235;
		int digit,count=0;
		
		while(num>0)
		{
			digit=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
