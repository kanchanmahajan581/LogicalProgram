package com.array;

public class ReverseArrayStoredINSame {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int n=5;
		int t;

		for(int i=0; i<n/2; i++)
		{
			t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;

		}
		System.out.println("Reverse Array");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
