package com.code;

public class Test1 {
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 5, 3, 2, 1 ,4 ,5 , 7};
		
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=i+1; j<a.length; j++)
			{
				
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			if(count==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
