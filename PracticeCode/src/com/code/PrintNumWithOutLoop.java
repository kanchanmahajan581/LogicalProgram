package com.code;

import java.util.stream.IntStream;

public class PrintNumWithOutLoop {
	
	public static void printNum(int number)
	{
		
		if(number<=100)
		{
//			System.out.println(number);
			number++;
//			printNum(number);
			
		}
		
	}
	
	public static void main(String[] args) {
		printNum(1);
		
		IntStream.range(1, 100).forEach(e->System.out.print(e+" "));
		
		
	}

}
