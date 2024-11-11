package com.filehandlingcsv;

import java.io.File;
import java.io.IOException;

public class CreateCSV {
	
	public static void main(String[] args) {
		
//		File f=new File("C:\\Users\\Yash\\Desktop\\presistancejava\\OCT11\\User.csv");
		File fc=new File("C:\\Users\\Yash\\Desktop\\presistancejava\\OCT11\\Copy.csv");
		
		try {
			if(fc.createNewFile())
			{
				System.out.println("File Created");
			}
			else
			{
				System.out.println("File Not Created");
			}
		} catch (IOException e) {
			
			System.out.println("Exception");
		}
	}

}
