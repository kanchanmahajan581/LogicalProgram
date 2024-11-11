package com.code;

public class RemoveChar {
	
	public static void main(String[] args) {
		
		String s="co@#$de*(";		
//		String s2=s1.replaceAll("[^a-zA-Z09]", "");
//		System.out.println(s2);
		int count=0;
		String remove="";
//		
		for(int i=0; i<s.length(); i++)
		{
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) &&
					!Character.isWhitespace(s.charAt(i)))
			{
				count++;
			}
			else
			{
				remove=remove+s.charAt(i);
			}
			if(count>=1)
			{
				System.out.print(s.charAt(i));
			}		
			
		}
		if(count==0)
		{
			System.out.println("Their are no Special chater");
		}
		System.out.println();
		System.out.println(remove+"\t");
		
	}

}
