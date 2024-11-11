package com.string;

public class ReplaceAlphabate {
	
public static void main(String[] args) {
	
	String s="Kanchan";
	char target='a';
	char replace='@';
	
	
	StringBuffer sb=new StringBuffer(s);
	
	for(int i=0; i<s.length(); i++)
	{
		int count=0;
		
		if(s.charAt(i)==target)
		{
			count++;
			
			if(count>=1)
			{
				sb.setCharAt(i, replace);
				break;
			}
		}
		
	}
	System.out.println("Orginal String"+s);
	System.out.println("Modified String"+sb.toString());
	
	
	
	
	
	
	
	
}

}
