package com.code;

public class Num {
	public static void main(String[] args) {
		
		int n=0;
		for(int i=1; i<=9; i++)
		{
			if(n<5)
			{
				n++;
				System.out.print(n+" ");
			}
			else
			{
				n--;
				System.out.print(n+" ");
			}
		}
	}

}
