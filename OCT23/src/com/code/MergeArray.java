package com.code;

public class MergeArray {
	
	public static void main(String[] args) {
		
		int a[]= {4,6,5,9,1};
		int b[]= {8,5,6,3,10};
		
		int c[]=new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
		}
		
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i]=b[i];
		}
		
		for(int j=0; j<(a.length+b.length); j++)
		{
			System.out.println(c[j]);
		}
	}

}
