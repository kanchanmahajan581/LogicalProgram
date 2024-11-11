package com.code;

public class RemoveDuplicate2 {
	
	public static void main(String[] args) {
		
		int arr[]= {12,23,52,65,12,23,85};
		
		
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
			if(count==0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
