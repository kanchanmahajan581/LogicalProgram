package com.array;

public class FindRepating {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,5,6,4,2,5};
		
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
