package com.pattern;

public class HollowDiamond {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=3; i++)
		{
			for(int j=0; j<=6; j++)
			{
				if((i+j==3)|| (j-i==3))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=2; i>=0; i--)
		{
			for(int j=0; j<=6; j++)
			{
				if((i+j==3)|| (j-i==3))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
