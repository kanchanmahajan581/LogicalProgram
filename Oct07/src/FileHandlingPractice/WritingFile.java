package FileHandlingPractice;

import java.io.FileWriter;

public class WritingFile {
	public static void main(String[] args) {
		
		try {
			
			FileWriter fw=new FileWriter("C:\\Users\\Yash\\Desktop\\presistancejava\\Oct07\\User.txt");
			try {
				
				fw.write("Java is a PowerFull Program");
				
			} finally {
				
				fw.close();
				
			}
			
			
			System.out.println("File write Susscessfully");
			
		} catch (Exception e) {
			
			System.out.println("Exception");
			
		}
	}

}
