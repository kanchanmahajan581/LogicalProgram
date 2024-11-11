
package com.code;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Insertarray {
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the Value of n");
		
		
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int [n];
		
		System.out.println("Enter the values of Arrays");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();			
		}
		System.out.println("Elements are");
		
		System.out.println(Arrays.toString(arr));
		
		int b[]=new int [n+1];
		
		System.out.println("Enter index of new Value to be inserted");
		int m=sc.nextInt();
		
		System.out.println("Enter new element to be inserted");
		int newvalue=sc.nextInt();
		
		for(int i=0; i<n+1; i++)
		{
			if(i<m)
			{
				b[i]=arr[i];
			}
			else if(i==m)
			{
				b[i]=newvalue;
			}
			else
			{
				b[i]=arr[i-1];
			}
			
			
			
		}
		System.out.println("Elements are");
		for(int i=0; i<n+1; i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		

		
		
		
		
	}

}
