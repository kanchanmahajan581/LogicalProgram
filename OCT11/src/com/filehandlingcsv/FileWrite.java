package com.filehandlingcsv;

import java.io.FileWriter;

public class FileWrite {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		
		sb.append("Name").append(",").append("City").append("\n");
		sb.append("Kanchan").append(",").append("Pune").append("\n");
		
		try(FileWriter fw=new FileWriter("C:\\Users\\Yash\\Desktop\\presistancejava\\OCT11\\User.csv"))
		
		{
			fw.write(sb.toString());
			System.out.println("File Created Successfully");
			
			
		}catch(Exception e) {
			
		}
		
		
	}

}
