package com.string;

public class OutPutDigit {
	
	public static void main(String[] args) {
		
		String s="32400121200";
		
		StringBuilder digit=new StringBuilder();
		StringBuilder nonDigit=new StringBuilder();
		
		for(char c : s.toCharArray())
		{
			if(Character.isDigit(c))
			{
				digit.append(c);
			}
			else
			{
				nonDigit.append(c);
			}
		}
		System.out.println(digit.toString());
		
		
	}

}
