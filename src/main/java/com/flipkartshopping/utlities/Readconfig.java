package com.flipkartshopping.utlities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig()
	{
		File src= new File("./Configuration/config.properties"); 
		
		try {
			
			FileInputStream fis =new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);	
		}
		catch (Exception e) {
			
			System.out.println("Exception"+e.getMessage());

	}
		
	}
		
		public String getApplicationURL()
		
		{
	
				String url =pro.getProperty("url");
	
				return url;

		}
		
		public String getapplicationusername()
		{
			
			String Username =pro.getProperty("username");
			
			return Username;
						
		}
				
		public String getapplicationpassword()
		{
			
			String Password =pro.getProperty("password");
			
			return Password;
						
		}
		
		public String Chromepath()
		{
			
			String Chromepath =pro.getProperty("chromepath");
			
			return Chromepath;
						
		}
		
		public String Firefoxpath()
		{
			
			String Firefoxpath =pro.getProperty("firefoxpath");
			
			return Firefoxpath;
						
		}
		

}
