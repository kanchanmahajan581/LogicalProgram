package com.filehandlingcsv;

import java.io.FileReader;

public class ReadCSV {
	
	public static void main(String[] args) {
		
		try {
			
			FileReader fr =new FileReader("C:\\Users\\Yash\\Desktop\\presistancejava\\OCT11\\User.csv");
			
			try {
				int i=0;
				
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}
				
			} finally {
				fr.close();
				
			}
			
		} catch (Exception e) {
			
		}
	}

}
