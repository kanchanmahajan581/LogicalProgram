package com.string;

public class Permutation {
	
	public static void printArray(int a[])
	{
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	public static void swap(int a[], int i , int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;		
	}	
	public static void per(int a[] , int cid)
	{
		if(cid==a.length-1)
		{
			printArray(a);
			
		}	
		
		for(int i=cid; i<a.length; i++ )
		{
			swap(a, cid, i);
			per(a, cid+1);
			swap(a, cid, i);
		}
		
	}	
	
	public static void main(String[] args) {
		int a[]= {1,2,3};
		per(a, 0);
	}

}
