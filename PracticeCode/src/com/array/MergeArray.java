package com.array;

public class MergeArray {
	
	public static void main(String[] args) {
		
		int a[]= {45,65,25,63,74};
		int b[]= {85,65,32,78,65};
		
		int c[]= new int[a.length+b.length];
		
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
			System.out.print(c[j]+" ");
		}
	}

}
