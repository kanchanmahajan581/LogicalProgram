package FileHandlingPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LoginSystem2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email");
		
		String email=sc.nextLine();
		
		System.out.println("Enter Password");
		
		String password=sc.nextLine();
		
		boolean isValid=false;
		
		try (BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Yash\\Desktop\\presistancejava\\Oct07\\User.txt"))){
			
			String line;
			while((line=br.readLine())!=null)
			{
				String[] cre=line.split(",");
				String e=cre[0];
				String p=cre[1];
				
				if(email.equals(e)&& password.equals(p))
				{
					isValid=true;
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("Error reading in a file");
		}
		if(isValid)
		{
			System.out.println("You Enter Correct Email");
		}
		else
		{
			System.out.println("You enter Wrong");
		}
	}

}
