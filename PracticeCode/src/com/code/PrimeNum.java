package com.code;

public class PrimeNum {
	
	public static void main(String[] args) {
		
		int n, i;
		
		for( n=2; n<=100; n++)
		{
			int count=0;
			
			for(i=2; i<=n/2; i++)
			{
				if(n%i==0)
				{
					count++;
					break;
					
				}
			}
			
			if(count==0)
			{
				System.out.print(n+" ");
			}
			
		}
		
		
	}

}
