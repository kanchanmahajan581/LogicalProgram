package com.code;

import java.util.Arrays;

public class AnagramString {
	
	public static void main(String[] args) {
		
		String s1="java";
		String s2="vaaj";
		
		char x[]=s1.toCharArray();
		char y[]=s2.toCharArray();
		
		char temp1;
		char temp2;
		
		for(int i=0; i<x.length; i++)
		{
			for(int j=i+1; j<x.length; j++)
			{
				if(x[i]>x[j])
				{
					temp1=x[i];
					x[i]=x[j];
					x[j]=temp1;
				}
			}
			System.out.println(x[i]);
		}
		
		for(int i=0; i<y.length; i++)
		{
			for(int j=i+1; j<y.length; j++)
			{
				if(y[i]>y[j])
				{
					temp2=y[i];
					y[i]=y[j];
					y[j]=temp2;
				}
			}
			System.out.print(y[i]);
		}
		
		boolean result=Arrays.equals(x, y);
		
		if(result==true)
		{
			System.out.println("It is a Anagram String");
		}
		else
		{
			System.out.println("It is not a Anagram String");
		}
		
		
		
		
		
	}

}
