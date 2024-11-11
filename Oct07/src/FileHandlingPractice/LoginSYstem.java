package FileHandlingPractice;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class LoginSYstem {
	
	

		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Email");
			String inputEmail=sc.nextLine();
			
			System.out.println("Enter Password");
			String inputPassword=sc.nextLine();
			
			boolean isValid=false;
			
			
			
			
			
			
			try (BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\Yash\\Desktop\\NextTech\\Sep27\\User.text"))){
				
				String line;
				while((line=br.readLine())!=null)
				{
					String credentials[]=line.split(",");
					String email=credentials[0];
					String password=credentials[1];
					
					if(inputEmail.equals(email) && inputPassword.equals(password))
					{
						isValid=true;
					}
					
				}		
				
				
				
			} catch (IOException e) {
				System.out.println("Erroe reading the file");
				
			}
			if(isValid)
			{
				System.out.println("You Enter Correct Email or Password");
			}
			else
			{
				System.out.println("You Enterd Wrong Email & Password");
			}
		}
	}


