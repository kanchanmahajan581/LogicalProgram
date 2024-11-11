package com.arrays;

public class CommaonElement {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {4,1,6,2,8};
		
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
			
		}
	}

}
