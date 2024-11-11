package com.code;

public class ArmstrongNum {
	public static void main(String[] args) {
		
		int n=371, rem, arms=0;
		int temp=n;
		
		while(n>0)
		{
			rem=n%10;
			arms=(rem*rem*rem)+arms;
			n=n/10;
		}
		
		if(temp==arms)
		{
			System.out.println("It is a Aramstron Number");
		}
		else
		{
			System.out.println("It is not a aramstron Number");
		}
	}

}
