package com.filehandlingcsv;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
	
	public static void main(String[] args) {
		
		try (FileInputStream fr=new FileInputStream("C:\\Users\\Yash\\Desktop\\presistancejava\\OCT11\\User.csv");
			FileOutputStream fw=new FileOutputStream("C:\\Users\\Yash\\Desktop\\presistancejava\\OCT11\\Copy.csv");
				
			){
			
			try {
				
				int i;
				while((i=fr.read())!=-1)
				{
					fw.write((char)i);
				}
				
				System.out.println("Copy File Successully");
				
			} finally {
				
				fw.close();
				fr.close();
				
			}
			
			
			
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
	}

}
