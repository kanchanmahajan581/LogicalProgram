package com.code;

import java.util.Scanner;

public class AramstrongNum {
	
	public static void main(String[] args) {
		
		int n, arm=0, rem;
		
		
		
		System.out.println("Enter Number");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
			
		}
		
		if(temp==arm)
		{
			System.out.println("It is a Aramstromg Number");
		}
		else
		{
			System.out.println("It is not a Aramstrong Number");
		}
		
		
	}

}
