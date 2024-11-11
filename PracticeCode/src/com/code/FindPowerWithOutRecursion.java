package com.code;

import java.util.Scanner;

public class FindPowerWithOutRecursion {
	
	public static void main(String[] args) {
		
		int x , n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter X");
		
		x=sc.nextInt();
		
		System.out.println("Enter Y");
		
		n=sc.nextInt();
		
		int result=1;
		
		for(int i=1; i<=n; i++)
		{
			result=result*x;
		}
		System.out.println(result);
	}

}
