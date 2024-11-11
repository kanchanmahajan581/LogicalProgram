package com.note;

public class RemoveSpace {
	
	public static void main(String[] args)
	{

	int a[]={1,2,3,4,5};
	int b[]={6,7,8,9,10};
	int c[]=new int[a.length+b.length];
	
	for(int i=0; i<=a.length; i++)
	{
		for(int j=i+1; j<=a.length; j++)
		{
			c[i]=a[i];
		}
//		System.out.println(c[i]);
	}
	
	for(int i=0; i<=b.length; i++)
	{
		for(int j=i+1; j<=b.length; j++)
		{
			c[a.length+i]=b[i];
		}
		
		
	}
	
	for(int i=0; i<(a.length+b.length); i++)
	{
		System.out.println(c[i]+ " ");
	}
	
	
	

	
	}

}
